package com.eric.jimiopen.common.my.interf.impl;

import com.eric.jimiopen.common.my.interf.IServ;

public class Serv implements IServ {
	
	@Override
	public String[] maintainSometing(String str, Integer i, byte[] b) {
		System.out.println("this:"+this.getClass().toString());
		return new String[]{"cindy","guoguo","xixi"};
	}
	
	@Override
	public void doSometing(){
		System.out.println("hello world");
	}
}
