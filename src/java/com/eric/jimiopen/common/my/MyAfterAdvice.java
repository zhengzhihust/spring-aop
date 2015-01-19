package com.eric.jimiopen.common.my;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.AfterReturningAdvice;

import com.alibaba.fastjson.JSON;

public class MyAfterAdvice implements AfterReturningAdvice {
	
	private static final Logger log = LoggerFactory.getLogger(MyAfterAdvice.class);

	@Override
	public void afterReturning(Object result, Method method, Object[] parameter, Object target) throws Throwable {
		log.info("=======MyAfterAdvice=======");
		log.info("[方法调用名]"+MyAfterAdvice.class+"", "result", JSON.toJSONString(result));
		log.info("[方法调用名]"+MyAfterAdvice.class+"", "method:"+method);
		if(parameter != null && parameter.length > 0){
			for(Object o : parameter){
				log.info("[方法调用名]"+"object:"+ JSON.toJSONString(o));
			} 
		}else {
			log.info("[方法调用名]"+MyAfterAdvice.class+"", "parameter is null");
		}
		log.info("[方法调用名]"+MyAfterAdvice.class+"", "target", target);
	}
}
