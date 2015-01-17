package com.eric.jimiopen.common.my.interf.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.eric.jimiopen.common.my.interf.IServ;

public class Serv implements IServ {
	
	private static final Logger log = LoggerFactory.getLogger(Serv.class);
	
	@Override
	public String[] maintainSometing(String str, Integer i, byte[] b) {
		log.info(Serv.class+"", "this:"+this.getClass().toString());
		return new String[]{"cindy","guoguo","xixi"};
	}
	
	@Override
	public void doSometing(){
		log.info(Serv.class+"", "hello world");
	}
}
