package com.eric.jimiopen.modules.register.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.eric.jimiopen.modules.register.bean.MemberPhone;
import com.eric.jimiopen.modules.register.dao.MemberPhoneDao;

@Repository
public class MemberPhoneDaoImpl implements MemberPhoneDao {
	
	private static final Logger log = LoggerFactory.getLogger(MemberPhoneDaoImpl.class);

	@Override
	public int savePhoneInfo(MemberPhone memberPhone) {
		return 0;
	}

	@Override
	public int updatePhoneInfo(MemberPhone memberPhone) {
		return 0;
	}

	@Override
	public int validPhoneInfo(Long memberId, String phone, int status) {
		return 0;
	}

	@Override
	public void deleteRegisterInfo(Long memberId) {
	}

	@Override
	public MemberPhone getMemberPhoneInfo(Long memberId) {
		return null;
	}

}
