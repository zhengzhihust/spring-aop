package com.eric.jimiopen.common.utils.dbutils;


import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SQLUtils
{

	public static String getInsertSql(Object entity, String entitySuffix) throws Exception 
	{
		String InsertSql = "";
		
		// �ж�ʵ���Ƿ�Ϊ��
		if(entity != null)
		{
			// ��ʼ��һ��Sql�������ʹ��
			InsertSql = "INSERT INTO `{?TABLE?}` ({?FIELDS?}) VALUES ({?VALUES?})";

			// ͨ�����ȡ��ݱ���
			String tableName;
			if(entitySuffix == null || entitySuffix.isEmpty())
			{
				//tableName = entity.getClass().getSimpleName().toLowerCase();
				tableName = entity.getClass().getSimpleName();
			}
			else
			{
				//tableName = entity.getClass().getSimpleName().toLowerCase() + entitySuffix;
				tableName = entity.getClass().getSimpleName() + entitySuffix;
			}
			// ��ʼ�������б���
			String fieldsL = "";
			// ��ʼ���ֶ�
			String valuesL = "";
			// ��ȡʵ��ķ�
			// Method[] methods = entity.getClass().getDeclaredMethods();
			Field[] fields = entity.getClass().getDeclaredFields();

			// ��ʼ�����С
			List<String> fieldsName = new ArrayList<String>();
			List<Object> typeValue = new ArrayList<Object>();
			// ��ʼ��һ��ѭ�����������Ա�������б��������

			// int j = 0;
			for(int i = 0; i < fields.length; i++)
			{
				fields[i].setAccessible(true);
				try {
					if(fields[i].get(entity) != null)
					{
						if(!fields[i].getName().equals("serialVersionUID")){
							fieldsName.add(fields[i].getName());
							typeValue.add(fields[i].getType());
						}
					}
				} catch (IllegalArgumentException e) {
					throw new Exception(e);
				} catch (IllegalAccessException e) {
					throw new Exception(e);
				}

			}
			// ͨ��setter������ȡ�����б���Ϊinsert���Ӽ���
			for(int i = 0; i < fieldsName.size(); i++)
			{
				fieldsL += "`" + fieldsName.get(i) + "`,";
				valuesL += "?,";
				
			}
			// ����insert���
			InsertSql = InsertSql.replace("{?TABLE?}", tableName);
			InsertSql = InsertSql.replace("{?FIELDS?}", fieldsL.substring(0, fieldsL.length() - 1));
			InsertSql = InsertSql.replace("{?VALUES?}", valuesL.substring(0, valuesL.length() - 1));
			// log.debug("insert����ǣ�" + InsertSql);
		}
		return InsertSql;
	}
	
	/**
	 * @Title getInsertSql
	 * @Description ͨ����ʵ����SQL���
	 * @param obj
	 *        ����
	 * @return
	 * @author �ź�����ע�� date 2013-7-8
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException
	 * @throws Exception
	 */
	public static SQL getInsertSqlFull(Object entity, String entitySuffix) throws Exception 
	{
		SQL sql = new SQL();
		String InsertSql = "";
		
		// �ж�ʵ���Ƿ�Ϊ��
		if(entity != null)
		{
			// ��ʼ��һ��Sql�������ʹ��
			InsertSql = "INSERT INTO `{?TABLE?}` ({?FIELDS?}) VALUES ({?VALUES?})";

			// ͨ�����ȡ��ݱ���
			String tableName;
			if(entitySuffix == null || entitySuffix.isEmpty())
			{
				tableName = entity.getClass().getSimpleName();
			}
			else
			{
				tableName = entity.getClass().getSimpleName() + entitySuffix;
			}
			// ��ʼ�������б���
			String fieldsL = "";
			// ��ʼ���ֶ���
			String valuesL = "";
			// ��ȡʵ��ķ�?
			// Method[] methods = entity.getClass().getDeclaredMethods();
			Field[] fields = entity.getClass().getDeclaredFields();

			// ��ʼ�����С
			List<String> fieldsName = new ArrayList<String>();
			List<Object> typeValue = new ArrayList<Object>();
			List<Object> fieldsValue = new ArrayList<Object>();
			// ��ʼ��һ��ѭ�����������Ա�������б��������?

			// int j = 0;
			for(int i = 0; i < fields.length; i++)
			{
				fields[i].setAccessible(true);
				try {
					if(fields[i].get(entity) != null)
					{
						if(!fields[i].getName().equals("serialVersionUID")){
							fieldsName.add(fields[i].getName());
							typeValue.add(fields[i].getType());
							fieldsValue.add(fields[i].get(entity));
						}
					}
				} catch (IllegalArgumentException e) {
					throw new Exception(e);
				} catch (IllegalAccessException e) {
					throw new Exception(e);
				}

			}
			// ͨ��setter������ȡ�������б���Ϊinsert���Ӽ���?
			for(int i = 0; i < fieldsName.size(); i++)
			{
				fieldsL += "`" + fieldsName.get(i) + "`,";
				valuesL += "?,";
				
			}
			InsertSql = InsertSql.replace("{?TABLE?}", tableName);
			InsertSql = InsertSql.replace("{?FIELDS?}", fieldsL.substring(0, fieldsL.length() - 1));
			InsertSql = InsertSql.replace("{?VALUES?}", valuesL.substring(0, valuesL.length() - 1));
			// log.debug("insert����ǣ�" + InsertSql);
			
			sql.setSql(InsertSql);
			sql.setParams(fieldsValue);
		}
		return sql;
	}
	


	//��ݴ��������type �ؼ��������� and | or
	public static String linkSql(List<String> sub_sql, String type) {
		String sql = "";
		if(sub_sql !=null && sub_sql.size() > 0){
			int i = 0;
			for(String sub : sub_sql){
				if(i == 0){
					sql += sub + " ";
				}else{
					sql += " " + type + " " + sub;
				}
				i++;
			}
			return sql;
		}else{
			return sql;
		}
	}
	public static String linkSqlParams(List<SQLTerm> paramsList, String type){
		String sql = "";
		if(paramsList !=null && paramsList.size() > 0){
			int i = 0;
			for(SQLTerm sub : paramsList){
				if(i == 0){
					sql += sub.getSqlTerm() + " ";
				}else{
					sql += " " + type + " " + sub.getSqlTerm();
				}
				i++;
			}
			return sql;
		}else{
			return sql;
		}
	}
	
	public static SQLMap initSQLParams(List<SQLTerm> sqlTermList, String type){
		if(sqlTermList != null && sqlTermList.size() > 0){
			SQLMap sqlsub = new SQLMap();
			String sql = linkSqlParams(sqlTermList, " and");
			sqlsub.setSql(sql);
			//List<Map<String, Object>> paramMapList = new ArrayList<Map<String, Object>>();
			for(SQLTerm term : sqlTermList){
				sqlsub.setParams(term.getParam());
			}
			return sqlsub;
		}else{
			return null;
		}
		
	}
	public static Map<String, Object> getResultSetForMap(ResultSet rs) throws SQLException {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		for(int i = 0; i < rs.getMetaData().getColumnCount(); i++){
			String colName = rs.getMetaData().getColumnLabel((i+1));
			Object value = rs.getObject(colName);
			resultMap.put(colName, value);
		}
		return resultMap;
	}

	public static Map<String, Object> setMap(String key, Object value) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put(key, value);
		return map;
	}
}
