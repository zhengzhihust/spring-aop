package com.eric.jimiopen.modules.register.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.eric.jimiopen.modules.register.bean.MemberBaseInfo;
import com.eric.jimiopen.modules.register.dao.MemberBaseInfoDao;

@Repository
public class MemberBaseInfoDaoImpl implements MemberBaseInfoDao {
	
	private static final Logger log = LoggerFactory.getLogger(MemberBaseInfoDaoImpl.class);
	
	@Override
	public int saveBaseInfo(MemberBaseInfo baseInfo) {
		return 0;
	}

	@Override
	public int updateBaseInfo(MemberBaseInfo baseInfo) {
		return 0;
	}

	@Override
	public void deleteRegisterInfo(Long memberId) {
		
	}

	@Override
	public MemberBaseInfo getMemberBaseInfo(Long memberId) {
		return null;
	}
}
