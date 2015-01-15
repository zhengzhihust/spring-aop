package com.eric.jimiopen.common.utils.interceptor;

import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.LoggerFactory;

import com.eric.jimiopen.modules.method.MethodStats;


/**
 * spring aop 锟斤拷锟斤拷 service & dao 锟接口碉拷锟斤拷
 * 
 * @author zhi.zheng 
 * @time 2015-1-7 11:04:20
 *
 */
public class PerfInterceptor implements MethodInterceptor {

	private Logger logger = (Logger) LoggerFactory.getLogger(PerfInterceptor.class.getName());
	private static ConcurrentHashMap<String, MethodStats> methodStats = new ConcurrentHashMap<String, MethodStats>();
	private static long statLogFrequency = 10;
	private static long methodWarningThreshold = 1000;

	public Object invoke(MethodInvocation method) throws Throwable {
		long start = System.currentTimeMillis();
		try {
			return method.proceed();
		} finally {
			updateStats(method.getMethod().getName(),(System.currentTimeMillis() - start));
		}
	}

	private void updateStats(String methodName, long elapsedTime) {
		com.eric.jimiopen.modules.method.MethodStats stats = methodStats.get(methodName);
		if (stats == null) {
			stats = new MethodStats(methodName);
			methodStats.put(methodName, stats);
		}
		stats.count++;
		stats.totalTime += elapsedTime;
		if (elapsedTime > stats.maxTime) {
			stats.maxTime = elapsedTime;
		}

		if (elapsedTime > methodWarningThreshold) {
			logger.info("####method warning: " + methodName + "(), cnt = " + stats.count + ", lastTime = " + elapsedTime + ", maxTime = " + stats.maxTime);
		}

		if (stats.count % statLogFrequency == 0) {
			long avgTime = stats.totalTime / stats.count;
			long runningAvg = (stats.totalTime - stats.lastTotalTime) / statLogFrequency;
			logger.info("####method: " + methodName + "(), cnt = " + stats.count + ", lastTime = " + elapsedTime + ", avgTime = " + avgTime + ", runningAvg = " + runningAvg + ", maxTime = " + stats.maxTime);
			stats.lastTotalTime = stats.totalTime;
		}
	}
}
