package com.eric.jimiopen.modules.method;

public class MethodStats {
	public String methodName;
	public long count;
	public long totalTime;
	public long lastTotalTime;
	public long maxTime;

	public MethodStats(String methodName) {
		this.methodName = methodName;
	}
	
	@Override
	public String toString(){
		return "MethodStats [methodName:"+methodName+",count:"+count+",totalTime:"+totalTime+",lastTotalTime:"+lastTotalTime+",maxTime:"+maxTime+"]";
	}
}
