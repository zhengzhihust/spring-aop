package com.eric.jimiopen.utils;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.HashMap;

public class MethodCounter implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1706566234725433458L;
	
	private HashMap<String, Integer> map= new HashMap<String, Integer>();
	private int allCount;
	
	protected synchronized void count(Method m){
		count(m.getName());
	}
	
	protected  synchronized void count(String methodName){
		Integer i = map.get(methodName);
		i = (i != null) ? new Integer(i.intValue() + 1) : new Integer(1);
		map.put(methodName, i);
		++ allCount;
	}
	
	public synchronized int getCalls(String methodName){
		Integer i = map.get(methodName);
		return (i != null ? i.intValue() : 0);
	}
	
	public synchronized int getCalls(){
		return this.allCount;
	}
	
	public synchronized boolean equals(Object object){
		return (object != null && object.getClass() == this.getClass());
	}
	
	public int hashCode(){
		return this.getClass().hashCode();
	}
}
