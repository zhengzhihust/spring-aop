package com.eric.jimiopen.common.utils.dbutils;

public class DbUtils {
	public static int getStartIndex(int pageNo,int pageSize){
		return (pageNo - 1) * pageSize;
	}
	
	public static String getTableName100(String tableName, Long endNum) {
		if (endNum > 9) {
			return new StringBuilder(tableName).append("_").append(endNum).toString();
		} else if (endNum < 0) {
			return new StringBuilder(tableName).toString();
		} else {
			return new StringBuilder(tableName).append("_0").append(endNum).toString();
		}
	}
}
