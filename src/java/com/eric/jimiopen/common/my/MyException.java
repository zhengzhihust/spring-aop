package com.eric.jimiopen.common.my;

public class MyException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 402582696271357739L;

	public MyException(String msg){
		super(msg);
	}
 
	public MyException() {
	
	}
 
	public MyException(String arg0, Throwable arg1){
		super(arg0, arg1);
	}
 
	public MyException(Throwable arg0){
		super(arg0);
	}
}
