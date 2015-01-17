package com.eric.jimiopen.modules.register.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.eric.jimiopen.modules.register.dao.MemberRegisterDao;

@Repository
public class MemberRegisterDaoImpl implements MemberRegisterDao {
	
	private static final Logger log = LoggerFactory.getLogger(MemberRegisterDaoImpl.class);

	@Override
	public Long saveMemberId() {
		return null;
	}

}
