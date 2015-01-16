package com.eric.jimiopen.common.my;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.MethodBeforeAdvice;

import com.eric.jimiopen.common.utils.logfactory.CommonUtil;

public class MyBeforeAdvice implements MethodBeforeAdvice{

	private static final Logger log = LoggerFactory.getLogger(MyBeforeAdvice.class);
	
	@Override
	public void before(Method method, Object[] parameters, Object target) throws Throwable {
		log.info("=======MyBeforeAdvice=======");
		log.info(CommonUtil.getLoggerDes("[方法调用类]", "target", target.getClass()));
		log.info(CommonUtil.getLoggerDes("[方法调用名称]", "methodName", method.getName()));
		if(parameters != null && parameters.length > 0){
			for(Object o : parameters){
				log.info(CommonUtil.getLoggerDes("[日志调用位置]"+MyBeforeAdvice.class, "[参数类型]"+o.getClass(), "[参数值]"+o));
			}
		}
	}
}
