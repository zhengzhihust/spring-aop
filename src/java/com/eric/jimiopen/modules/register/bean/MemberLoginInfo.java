package com.eric.jimiopen.modules.register.bean;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.JSON;

public class MemberLoginInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3660492016475862449L;

	private Long memberId;
	
	private String phone;
	
	private String email;
	
	private String nickName;
	
	private String pwd;
	
	private String salt;
	
	private Date createTime;
	
	private Date lastLoginTime;
	
	private Date lastModTime;
	
	private String createIp;
	
	private String lastLoginIp;
	
	private String lastModIp;
	
	public MemberLoginInfo(){}
	
	public MemberLoginInfo(Long memberId, String phone, String email, String nickName, String pwd, String salt, Date createTime, Date lastLoginTime, Date lastModTime, String createIp, String lastLoginIp, String lastModIp){
		this.memberId = memberId;
		this.phone = phone;
		this.email = email;
		this.nickName = nickName;
		this.pwd = pwd;
		this.salt = salt;
		this.createTime = createTime;
		this.lastLoginTime = lastLoginTime;
		this.lastModTime = lastModTime;
		this.createIp = createIp;
		this.lastLoginIp = lastLoginIp;
		this.lastModIp = lastModIp;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
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

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
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
	
	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
	
}
