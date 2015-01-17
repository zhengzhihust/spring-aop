package com.eric.jimiopen.modules.register.dao;

import com.eric.jimiopen.modules.register.bean.MemberBaseInfo;

public interface MemberBaseInfoDao {

	public int saveBaseInfo(MemberBaseInfo baseInfo);

	public int updateBaseInfo(MemberBaseInfo baseInfo);

}
