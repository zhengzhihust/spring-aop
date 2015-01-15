package com.eric.jimiopen.common.utils.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class CountingAfterReturningAdvice extends MethodCounter implements AfterReturningAdvice {


	/**
	 * 
	 */
	private static final long serialVersionUID = 9053039361482004335L;

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		count(method);
	}
}
