package com.eric.jimiopen.common.utils.advice;

import java.io.IOException;

import org.apache.commons.lang.UnhandledException;
import org.springframework.aop.ThrowsAdvice;

public class CountingThrowsAdvice extends MethodCounter implements ThrowsAdvice {
	/**
	 * 
	 */
	private static final long serialVersionUID = 701965235886165707L;

	public void afterThrowing(IOException ex) throws Throwable {
		count(IOException.class.getName());
	}
	
	public void afterThrowing(UnhandledException ex) throws Throwable {
		count(UnhandledException.class.getName());
	}
}
