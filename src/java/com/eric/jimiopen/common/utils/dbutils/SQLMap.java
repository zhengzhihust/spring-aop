package com.eric.jimiopen.common.utils.dbutils;  

import java.util.HashMap;
import java.util.Map;

public class SQLMap {
	private String sql;
	private Map<String, Object> params;
	public String getSql() {
		return sql;
	}
	public void setSql(String sql) {
		this.sql = sql;
	}
	public Map<String, Object> getParams() {
		return params;
	}
	public void setParams(Map<String, Object> params) {
		if(this.params == null){
			this.params = new HashMap<String, Object>();
			this.params.putAll(params);
		}else{
			this.params.putAll(params);
		}
	}
	
}
  