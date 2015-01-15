package com.eric.jimiopen.common.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eric.jimiopen.common.my.interf.IServ;

public class MainTest {
	public static void main(String[] args){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] {"classpath:spring-context.xml"});
		IServ ser = (IServ) ctx.getBean("invoker");
		ser.doSth();
		try{
			ser.doA();
		} catch (Throwable t){
			t.printStackTrace();
		}
	}
}
