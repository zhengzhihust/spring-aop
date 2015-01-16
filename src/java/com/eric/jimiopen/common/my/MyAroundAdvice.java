package com.eric.jimiopen.common.my;

import java.util.HashSet;
import java.util.Set;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyAroundAdvice implements MethodInterceptor{
	
	private static final Logger log = LoggerFactory.getLogger(MyAroundAdvice.class);
	
	private Set<MethodInvocation> set=new HashSet<MethodInvocation>();
	
	@Override
	public Object invoke(MethodInvocation method) throws Throwable {
		log.info("=======MyAroundAdvice=======");
		set.add(method);
		Object result=method.proceed();
		return result;
	}
}
