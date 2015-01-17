package com.eric.jimiopen.modules.register.service;

import java.util.Collection;

import com.eric.jimiopen.modules.register.vo.MemberResigterVo;

public interface MemberRegisterService {

	public Long saveMemberId();
	
	public int saveLoginInfo(MemberResigterVo resigterVo);
	
	public int saveBaseInfo(MemberResigterVo resigterVo);
	
	public int savePhoneInfo(MemberResigterVo resigterVo);
	
	public int updateBaseInfo(MemberResigterVo resigterVo);
	
	public int updateLoginInfo(MemberResigterVo resigterVo);

	public int updatePhoneInfo(MemberResigterVo resigterVo);
	
	public int update(Collection collection);
	
	public int validPhoneInfo(Long memberId, String phone, int status);
	
	public int deleteRegisterInfo(Long memberId);
}
