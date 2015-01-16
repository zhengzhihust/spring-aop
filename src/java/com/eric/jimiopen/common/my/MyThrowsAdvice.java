package com.eric.jimiopen.common.my;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.ThrowsAdvice;

public class MyThrowsAdvice implements ThrowsAdvice {
	
	private static final Logger log = LoggerFactory.getLogger(MyThrowsAdvice.class);
	
	public void afterThrowing(MyException e){ 
		//可以定义多个方法，只要传入的参数是不同异常
		log.info("=======MyThrowsAdvice.afterThrowing.MyException=======");
		log.info(MyThrowsAdvice.class+"", "afterThrowing", e.toString());
	}
	
	public void afterThrowing(RuntimeException e){
		// 可以定义多个方法，只要传入的参数是不同异常
		log.info("=======MyThrowsAdvice.afterThrowing.RuntimeException=======");
		log.error("RuntimeException!");
	}
}
