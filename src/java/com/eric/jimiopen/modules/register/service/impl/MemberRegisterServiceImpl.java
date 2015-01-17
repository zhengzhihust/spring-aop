package com.eric.jimiopen.modules.register.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eric.jimiopen.modules.register.bean.MemberBaseInfo;
import com.eric.jimiopen.modules.register.bean.MemberLoginInfo;
import com.eric.jimiopen.modules.register.bean.MemberPhone;
import com.eric.jimiopen.modules.register.dao.MemberBaseInfoDao;
import com.eric.jimiopen.modules.register.dao.MemberLoginInfoDao;
import com.eric.jimiopen.modules.register.dao.MemberPhoneDao;
import com.eric.jimiopen.modules.register.dao.MemberRegisterDao;
import com.eric.jimiopen.modules.register.service.MemberRegisterService;
import com.eric.jimiopen.modules.register.vo.MemberResigterVo;

@Service
public class MemberRegisterServiceImpl implements MemberRegisterService {
	
	@Autowired
	private MemberRegisterDao registerDao;
	
	@Autowired
	private MemberBaseInfoDao baseInfoDao;
	
	@Autowired
	private MemberLoginInfoDao loginInfoDao;
	
	@Autowired
	private MemberPhoneDao phoneDao;

	@Override
	public Long saveMemberId() {
		Long memberId = registerDao.saveMemberId();
		return memberId;
	}

	
	@Override
	public int saveLoginInfo(MemberResigterVo resigterVo) {
		MemberLoginInfo loginInfo = assemblyLoginInfo(resigterVo);
		int count = loginInfoDao.saveLoginInfo(loginInfo);
		return count;
	}

	@Override
	public int saveBaseInfo(MemberResigterVo resigterVo) {
		MemberBaseInfo baseInfo = assemblyBaseInfo(resigterVo);
		int count = baseInfoDao.saveBaseInfo(baseInfo);
		return count;
	}

	@Override
	public int savePhoneInfo(MemberResigterVo resigterVo) {
		MemberPhone memberPhone = assemblyPhoneInfo(resigterVo);
		int count = phoneDao.savePhoneInfo(memberPhone);
		return count;
	}

	@Override
	public int updateBaseInfo(MemberResigterVo resigterVo) {
		MemberBaseInfo baseInfo = assemblyBaseInfo(resigterVo);
		int count = baseInfoDao.updateBaseInfo(baseInfo);
		return  count;
	}

	@Override
	public int updateLoginInfo(MemberResigterVo resigterVo) {
		MemberLoginInfo loginInfo = assemblyLoginInfo(resigterVo);
		int count = loginInfoDao.updateLoginInfo(loginInfo);
		return count;
	}

	@Override
	public int updatePhoneInfo(MemberResigterVo resigterVo) {
		MemberPhone memberPhone = assemblyPhoneInfo(resigterVo);
		int count = phoneDao.savePhoneInfo(memberPhone);
		return count;
	}

	@Override
	public int update(Collection collection) {
		if(collection instanceof MemberBaseInfo){
		}
		return 0;
	}

	@Override
	public int validPhoneInfo(Long memberId, String phone, int status) {
		return 0;
	}

	@Override
	public int deleteRegisterInfo(Long memberId) {
		return 0;
	}
	
	private MemberBaseInfo assemblyBaseInfo(MemberResigterVo resigterVo){
		return null;
	}
	
	private MemberLoginInfo assemblyLoginInfo(MemberResigterVo resigterVo){
		return null;
	}
	
	public MemberPhone assemblyPhoneInfo(MemberResigterVo resigterVo){
		return null;
	}
}
