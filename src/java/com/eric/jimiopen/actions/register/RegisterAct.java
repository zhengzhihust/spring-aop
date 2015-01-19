package com.eric.jimiopen.actions.register;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eric.jimiopen.modules.register.service.MemberRegisterService;
import com.eric.jimiopen.modules.register.vo.MemberResigterVo;

@Controller
@RequestMapping("/register")
public class RegisterAct {
	
	@Autowired
	MemberRegisterService memberRegisterService;
	
	@RequestMapping("/index")
	public String index(HttpServletRequest request, HttpServletResponse response){
		return "/register/index";
	}
	
	@RequestMapping("/info")
	public void info(HttpServletRequest request, HttpServletResponse response, String phone, String pwd, String nickName){
		if(StringUtils.isNotBlank(phone) && StringUtils.isNotBlank(pwd) && StringUtils.isNotBlank(nickName)){
			MemberResigterVo resigterVo = new MemberResigterVo();
		}
	}
}
