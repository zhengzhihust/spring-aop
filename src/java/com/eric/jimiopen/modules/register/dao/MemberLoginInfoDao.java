package com.eric.jimiopen.modules.register.dao;

import com.eric.jimiopen.modules.register.bean.MemberLoginInfo;

public interface MemberLoginInfoDao {

	public int saveLoginInfo(MemberLoginInfo loginInfo);

	public int updateLoginInfo(MemberLoginInfo loginInfo);

}