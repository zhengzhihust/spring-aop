package com.eric.jimiopen.common.utils.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class CountingBeforeAdvice extends MethodCounter implements MethodBeforeAdvice {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5119407281319554750L;

	public void before(Method m, Object[] args, Object target) throws Throwable {
		count(m);
	}
}
