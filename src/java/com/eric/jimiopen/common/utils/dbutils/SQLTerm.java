package com.eric.jimiopen.common.utils.dbutils;

import java.util.Map;


public class SQLTerm
{
	private String sqlTerm;
	private Map<String, Object> param;


	public String getSqlTerm()
	{
		return sqlTerm;
	}


	public void setSqlTerm(String sqlTerm)
	{
		this.sqlTerm = sqlTerm;
	}


	public Map<String, Object> getParam() {
		return param;
	}


	public void setParam(Map<String, Object> param) {
		this.param = param;
	}

}
