package com.eric.jimiopen.common.my.interf.impl;

import com.eric.jimiopen.common.my.interf.IServ;

public class Serv implements IServ {
	
	@Override
	public String[] doSth(String str, Integer i, byte[] b) {
		System.out.println("this:"+this.getClass().toString());
		return new String[]{"cindy","guoguo","xixi"};
	}
	
	@Override
	public void doA(){
		System.out.println("hello world");
	}
}
