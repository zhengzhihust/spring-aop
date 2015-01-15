package com.eric.jimiopen.common.my;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

import com.alibaba.fastjson.JSON;

public class MyAfterAdvice implements AfterReturningAdvice {
	
	@Override
	public void afterReturning(Object result, Method method, Object[] parameter, Object target) throws Throwable {
		System.out.println("=======MyAfterAdvice=======");
		System.out.println("result:"+JSON.toJSONString(result));
		System.out.println("method:"+method);
		if(parameter != null){
			if(parameter.equals("")){
				System.out.println("true");
			} else {
				System.out.println("false");
			}
			for(Object o : parameter){
				System.out.println("object:"+ JSON.toJSONString(o));
			} 
			System.out.println("hehehebbb");
		}else {
			System.out.println("hehehe");
		}
		System.out.println("parameter:"+parameter);
		System.out.println("target:"+target);
	}
}
