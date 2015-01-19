package com.eric.jimiopen.modules.register.service;

import com.eric.jimiopen.modules.register.bean.MemberBaseInfo;
import com.eric.jimiopen.modules.register.bean.MemberLoginInfo;
import com.eric.jimiopen.modules.register.bean.MemberPhone;
import com.eric.jimiopen.modules.register.vo.MemberResigterVo;

public interface MemberRegisterService {

	public Long saveMemberId();
	
	public int saveLoginInfo(MemberResigterVo resigterVo);
	
	public int saveBaseInfo(MemberResigterVo resigterVo);
	
	public int savePhoneInfo(MemberResigterVo resigterVo);
	
	public int updateBaseInfo(MemberResigterVo resigterVo);
	
	public int updateLoginInfo(MemberResigterVo resigterVo);

	public int updatePhoneInfo(MemberResigterVo resigterVo);
	
	public <T> int update(T obj);
	
	public int validPhoneInfo(Long memberId, String phone, int status);
	
	public void deleteRegisterInfo(Long memberId);
	
	public MemberBaseInfo getMemberBaseInfo(Long memberId);
	
	public MemberLoginInfo getMemberLoginInfo(Long memberId);
	
	public MemberPhone getMemberPhoneInfo(Long memberId);

	public int loginVerify(String phone, String pwd);
}
