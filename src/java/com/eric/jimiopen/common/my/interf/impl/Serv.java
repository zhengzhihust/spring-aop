package com.eric.jimiopen.common.my.interf.impl;

import com.eric.jimiopen.common.my.MyException;
import com.eric.jimiopen.common.my.interf.IServ;

public class Serv implements IServ {
	
	@Override
	public String[] doSth() {
		System.out.println(this);
		return new String[]{"cindy","guoguo","xixi"};
	}
	
	@Override
	public void doA(){
		throw new MyException("111111111");
	}
}