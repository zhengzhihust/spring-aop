package com.eric.jimiopen.common.constants;

/**
 * @author Eric Zheng
 * @time 2015-01-17 19:17:15
 *
 */
public enum LoginReturnEnum {
	CODE_STATUS_1("没有输入电话号码", 1), 
	CODE_STATUS_2("没有输入密码", 2), 
	CODE_STATUS_3("电话号码没有注册", 3), 
	CODE_STATUS_4("手机号码或密码不匹配", 4), 
	CODE_STATUS_5("登陆成功", 5);

	private String name;
	private int index;

	private LoginReturnEnum(String name, int index) {
		this.name = name;
		this.index = index;
	}

	public static String getName(int index) {
		for (LoginReturnEnum e : LoginReturnEnum.values()) {
			if (e.getIndex() == index) {
				return e.name;
			}
		}
		return null;
	}

	// get set 鏂规硶
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public static LoginReturnEnum getEnum(int status) {
		switch (status) {
		case 1:
			return CODE_STATUS_1;
		case 2:
			return CODE_STATUS_2;
		case 3:
			return CODE_STATUS_3;
		case 4:
			return CODE_STATUS_4;
		case 5:
			return CODE_STATUS_5;
		default:
			return null;
		}

	}
}
