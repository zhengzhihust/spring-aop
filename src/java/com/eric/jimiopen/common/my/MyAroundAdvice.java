package com.eric.jimiopen.common.my;

import java.util.HashSet;
import java.util.Set;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAroundAdvice implements MethodInterceptor{
	
	private Set<MethodInvocation> set=new HashSet<MethodInvocation>();
	
	@Override
	public Object invoke(MethodInvocation method) throws Throwable {
		System.out.println("=======MyAroundAdvice=======");
		set.add(method);
		Object result=method.proceed();
		return result;
	}
}
