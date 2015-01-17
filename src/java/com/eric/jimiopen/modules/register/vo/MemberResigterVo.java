package com.eric.jimiopen.modules.register.vo;

import java.io.Serializable;

import com.alibaba.fastjson.JSON;

public class MemberResigterVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4821079828639244539L;

	private String memberId;
	
	private String nickName;

	private String phone;
	
	private String email;
	
	private String sex;
	
	private String age;
	
	private String workCity;
	
	private String cityCode;
	
	private String createTime;
	
	private String lastLoginTime;
	
	private String lastModTime;
	
	private String createIp;
	
	private String lastLoginIp;
	
	private String lastModIp;
	
	private String valid;
	
	public MemberResigterVo(){}
	
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getWorkCity() {
		return workCity;
	}

	public void setWorkCity(String workCity) {
		this.workCity = workCity;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getLastModTime() {
		return lastModTime;
	}

	public void setLastModTime(String lastModTime) {
		this.lastModTime = lastModTime;
	}

	public String getCreateIp() {
		return createIp;
	}

	public void setCreateIp(String createIp) {
		this.createIp = createIp;
	}

	public String getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public String getLastModIp() {
		return lastModIp;
	}

	public void setLastModIp(String lastModIp) {
		this.lastModIp = lastModIp;
	}

	public String getValid() {
		return valid;
	}

	public void setValid(String valid) {
		this.valid = valid;
	}
	
	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
}