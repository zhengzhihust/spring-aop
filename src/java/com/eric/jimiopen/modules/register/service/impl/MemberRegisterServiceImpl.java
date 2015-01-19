package com.eric.jimiopen.modules.register.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eric.jimiopen.common.utils.logfactory.CommonUtil;
import com.eric.jimiopen.modules.register.bean.MemberBaseInfo;
import com.eric.jimiopen.modules.register.bean.MemberLoginInfo;
import com.eric.jimiopen.modules.register.bean.MemberPhone;
import com.eric.jimiopen.modules.register.dao.MemberBaseInfoDao;
import com.eric.jimiopen.modules.register.dao.MemberLoginInfoDao;
import com.eric.jimiopen.modules.register.dao.MemberPhoneDao;
import com.eric.jimiopen.modules.register.dao.MemberRegisterDao;
import com.eric.jimiopen.modules.register.service.MemberRegisterService;
import com.eric.jimiopen.modules.register.vo.MemberResigterVo;
import com.eric.jimiopen.modules.register.vo.RegVoTransformator;

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
	
	private static final Logger log = LoggerFactory.getLogger(MemberRegisterServiceImpl.class);

	@Override
	public Long saveMemberId() {
		Long memberId = registerDao.saveMemberId();
		return memberId;
	}
	
	@Override
	public int saveLoginInfo(MemberResigterVo resigterVo) {
		if(resigterVo == null){
			return 0;
		}
		MemberLoginInfo loginInfo = RegVoTransformator.assemblyLoginInfo(resigterVo);
		int count = loginInfoDao.saveLoginInfo(loginInfo);
		return count;
	}

	@Override
	public int saveBaseInfo(MemberResigterVo resigterVo) {
		if(resigterVo == null){
			return 0;
		}
		MemberBaseInfo baseInfo = RegVoTransformator.assemblyBaseInfo(resigterVo);
		int count = baseInfoDao.saveBaseInfo(baseInfo);
		return count;
	}

	@Override
	public int savePhoneInfo(MemberResigterVo resigterVo) {
		if(resigterVo == null){
			return 0;
		}
		MemberPhone memberPhone = RegVoTransformator.assemblyPhoneInfo(resigterVo);
		int count = phoneDao.savePhoneInfo(memberPhone);
		return count;
	}

	@Override
	public int updateBaseInfo(MemberResigterVo resigterVo) {
		if(resigterVo == null){
			return 0;
		}
		MemberBaseInfo baseInfo = RegVoTransformator.assemblyBaseInfo(resigterVo);
		int count = baseInfoDao.updateBaseInfo(baseInfo);
		return  count;
	}

	@Override
	public int updateLoginInfo(MemberResigterVo resigterVo) {
		if(resigterVo == null){
			return 0;
		}
		MemberLoginInfo loginInfo = RegVoTransformator.assemblyLoginInfo(resigterVo);
		int count = loginInfoDao.updateLoginInfo(loginInfo);
		return count;
	}

	@Override
	public int updatePhoneInfo(MemberResigterVo resigterVo) {
		if(resigterVo == null){
			return 0;
		}
		MemberPhone memberPhone = RegVoTransformator.assemblyPhoneInfo(resigterVo);
		int count = phoneDao.savePhoneInfo(memberPhone);
		return count;
	}

	@Override
	public <T> int update(T obj) {
		int count = 0;
		if(obj != null){
			if(obj instanceof MemberBaseInfo){
				MemberBaseInfo baseInfo = (MemberBaseInfo)obj;
				count = baseInfoDao.updateBaseInfo(baseInfo);
			}
			if(obj instanceof MemberLoginInfo){
				MemberLoginInfo loginInfo = (MemberLoginInfo)obj;
				count = loginInfoDao.updateLoginInfo(loginInfo);
			}
			if(obj instanceof MemberPhone){
				MemberPhone memberPhone = (MemberPhone)obj;
				count = phoneDao.updatePhoneInfo(memberPhone);
			}
		}
		return count;
	}

	@Override
	public int validPhoneInfo(Long memberId, String phone, int status) {
		int count = 0;
		if(memberId != null && memberId.longValue() > 0 && StringUtils.isNotBlank(phone) && status > 0){
			count = phoneDao.validPhoneInfo(memberId, phone, status);
		} else {
			log.info(CommonUtil.getLoggerDes(MemberRegisterServiceImpl.class+"", "validPhoneInfo", "memberId:"+memberId, "phone:"+phone, "status:"+status));
		}
		return count;
	}

	@Override
	public void deleteRegisterInfo(Long memberId) {
		if(memberId == null || memberId.longValue() <= 0){
			return;
		}
		loginInfoDao.deleteRegisterInfo(memberId);
		baseInfoDao.deleteRegisterInfo(memberId);
		phoneDao.deleteRegisterInfo(memberId);
	}
	
	@Override
	public MemberBaseInfo getMemberBaseInfo(Long memberId) {
		MemberBaseInfo baseInfo = null;
		if(memberId != null && memberId.longValue() > 0){
			baseInfo = baseInfoDao.getMemberBaseInfo(memberId);
		}
		return baseInfo;
	}

	@Override
	public MemberLoginInfo getMemberLoginInfo(Long memberId) {
		MemberLoginInfo loginInfo = null;
		if(memberId != null && memberId.longValue() > 0){
			loginInfo = loginInfoDao.getMemberLoginInfo(memberId);
		}
		return loginInfo;
	}

	@Override
	public MemberPhone getMemberPhoneInfo(Long memberId) {
		MemberPhone memberPhone = null;
		if(memberId != null && memberId.longValue() > 0){
			memberPhone = phoneDao.getMemberPhoneInfo(memberId);
		}
		return memberPhone;
	}
	
	@Override
	public int loginVerify(String phone, String pwd) {
		int count = loginInfoDao.loginVerify(phone, pwd);
		return count;
	}
	
}
