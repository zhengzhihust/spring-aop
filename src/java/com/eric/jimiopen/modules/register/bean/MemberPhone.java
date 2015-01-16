package com.eric.jimiopen.modules.register.bean;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.JSON;

public class MemberPhone implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8752159148298903597L;

	private Long memberId;
	
	private String phone;
	
	private Integer valid;
	
	private Date createTime;
	
	private String createIp;
	
	public MemberPhone(){}
	
	public MemberPhone(Long memberId, String phone, Integer valid, Date createTime, String createIp){
		this.memberId = memberId;
		this.phone = phone;
		this.valid = valid;
		this.createTime = createTime;
		this.createIp = createIp;
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

	public Integer getValid() {
		return valid;
	}

	public void setValid(Integer valid) {
		this.valid = valid;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateIp() {
		return createIp;
	}

	public void setCreateIp(String createIp) {
		this.createIp = createIp;
	}
	
	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
}
