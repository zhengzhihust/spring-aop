package com.eric.jimiopen.utils;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class CountingAfterReturningAdvice extends MethodCounter implements AfterReturningAdvice {


	/**
	 * 
	 */
	private static final long serialVersionUID = 9053039361482004335L;

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		count(arg1);
	}
}
