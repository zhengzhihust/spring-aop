package com.eric.jimiopen.modules.register.dao;

import com.eric.jimiopen.modules.register.bean.MemberPhone;

public interface MemberPhoneDao {

	public int savePhoneInfo(MemberPhone memberPhone);

	public int updatePhoneInfo(MemberPhone memberPhone);

	public int validPhoneInfo(Long memberId, String phone, int status);

	public void deleteRegisterInfo(Long memberId);

	public MemberPhone getMemberPhoneInfo(Long memberId);

}
