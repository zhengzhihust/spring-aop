package com.eric.jimiopen.common.my;

import org.springframework.aop.ThrowsAdvice;

public class MyThrowsAdvice implements ThrowsAdvice {
	
	public void afterThrowing(MyException e){ 
		//可以定义多个方法，只要传入的参数是不同异常
		System.out.println("=======MyThrowsAdvice.afterThrowing.MyException=======");
		System.err.println(e.toString());
	}
	
	public void afterThrowing(RuntimeException e){
		// 可以定义多个方法，只要传入的参数是不同异常
		System.out.println("=======MyThrowsAdvice.afterThrowing.RuntimeException=======");
		System.err.print("RuntimeException!");
	}
}
