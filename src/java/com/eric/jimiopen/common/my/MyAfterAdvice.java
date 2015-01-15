package com.eric.jimiopen.common.my;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MyAfterAdvice implements AfterReturningAdvice {
	
	@Override
	public void afterReturning(Object result, Method method, Object[] parameter, Object target) throws Throwable {
		System.out.println("=======MyAfterAdvice=======");
		System.out.println("result:"+result);
		System.out.println("method:"+method);
		System.out.println("parameter:"+parameter);
		System.out.println("target:"+target);
	}
}
