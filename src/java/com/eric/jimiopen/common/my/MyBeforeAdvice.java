package com.eric.jimiopen.common.my;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyBeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] parameters, Object target) throws Throwable {
		System.out.println("=======MyBeforeAdvice=======");
		System.out.println(method.getName());
		System.out.println(parameters);
		System.out.println(target);
	}
}
