package com.eric.jimiopen.modules.register.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.eric.jimiopen.modules.register.bean.MemberLoginInfo;
import com.eric.jimiopen.modules.register.dao.MemberLoginInfoDao;

@Repository
public class MemberLoginInfoDaoImpl implements MemberLoginInfoDao {
	
	private static final Logger log = LoggerFactory.getLogger(MemberLoginInfoDaoImpl.class);

	@Override
	public int saveLoginInfo(MemberLoginInfo loginInfo) {
		return 0;
	}

	@Override
	public int updateLoginInfo(MemberLoginInfo loginInfo) {
		return 0;
	}

	@Override
	public void deleteRegisterInfo(Long memberId) {
	}

	@Override
	public MemberLoginInfo getMemberLoginInfo(Long memberId) {
		return null;
	}

	@Override
	public int loginVerify(String phone, String pwd) {
		return 0;
	}

}
