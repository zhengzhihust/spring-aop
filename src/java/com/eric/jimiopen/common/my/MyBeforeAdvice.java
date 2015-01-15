package com.eric.jimiopen.common.my;

import java.lang.reflect.Method;

import org.apache.commons.lang3.StringUtils;
import org.directwebremoting.json.JsonUtil;
import org.springframework.aop.MethodBeforeAdvice;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

public class MyBeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] parameters, Object target) throws Throwable {
		System.out.println("=======MyBeforeAdvice=======");
		System.out.println("methodName:"+method.getName());
		int i = 1;
		if(parameters != null && parameters.length > 0){
			i = 100;
			for(Object o : parameters){
				System.out.println("object:"+ o.toString());
			}
		} else {
			System.out.println("hahaha");
		}
		System.out.println("parameters:"+i);
		System.out.println("target:"+target.getClass().toString());
	}
}
