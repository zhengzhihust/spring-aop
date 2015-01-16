package com.eric.jimiopen.modules.register.bean;

import java.io.Serializable;
import java.sql.Date;

import com.alibaba.fastjson.JSON;

public class MemberBaseInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1058948720279540549L;

	private Long memberId;
	
	private String nickName;
	
	private Integer sex;
	
	private Integer age;
	
	private String workCity;
	
	private Long cityCode;
	
	private Date createTime;
	
	private Date lastModTime;
	
	private String createIp;
	
	private String lastModIp;

	public MemberBaseInfo(){}
	
	public MemberBaseInfo(Long memberId, String nickName, Integer sex, Integer age, String workCity, Long cityCode, Date createTime, Date lastModTime, String createIp, String lastModIp){
		this.memberId = memberId;
		this.nickName = nickName;
		this.sex = sex;
		this.age = age;
		this.workCity = workCity;
		this.cityCode = cityCode;
		this.createTime = createTime;
		this.lastModTime = lastModTime;
		this.createIp = createIp;
		this.lastModIp = lastModIp;
	}
	
	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getWorkCity() {
		return workCity;
	}

	public void setWorkCity(String workCity) {
		this.workCity = workCity;
	}

	public Long getCityCode() {
		return cityCode;
	}

	public void setCityCode(Long cityCode) {
		this.cityCode = cityCode;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastModTime() {
		return lastModTime;
	}

	public void setLastModTime(Date lastModTime) {
		this.lastModTime = lastModTime;
	}

	public String getCreateIp() {
		return createIp;
	}

	public void setCreateIp(String createIp) {
		this.createIp = createIp;
	}

	public String getLastModIp() {
		return lastModIp;
	}

	public void setLastModIp(String lastModIp) {
		this.lastModIp = lastModIp;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
}
