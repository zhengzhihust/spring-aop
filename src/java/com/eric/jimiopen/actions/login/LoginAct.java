package com.eric.jimiopen.actions.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eric.jimiopen.actions.BaseAct;
import com.eric.jimiopen.common.constants.LoginReturnEnum;
import com.eric.jimiopen.modules.register.service.MemberRegisterService;

@Controller
@RequestMapping("/login")
public class LoginAct extends BaseAct{

	private static final Logger log = LoggerFactory.getLogger(LoginAct.class);
	
	@Autowired
	MemberRegisterService memberRegisterService;
	
	@RequestMapping("index")
	public String index(HttpServletRequest request,HttpServletResponse response){
		return "/login/index";
	}
	
	@RequestMapping("login")
	public String login(HttpServletRequest request,HttpServletResponse response, String phone, String pwd){
		if(StringUtils.isBlank(phone)){
			return LoginRet(request, response, true, LoginReturnEnum.CODE_STATUS_1, null);
		} else if(StringUtils.isBlank(pwd)){
			return LoginRet(request, response, true, LoginReturnEnum.CODE_STATUS_2, null);
		}
		boolean isvalid = memberRegisterService.loginVerify(phone, pwd);
		return null;
	}
	
	private String LoginRet(HttpServletRequest request,HttpServletResponse response, boolean isAjax, LoginReturnEnum loginReturnEnum, String url){
		if(isAjax){
			putParamResult(response, loginReturnEnum.getIndex(), loginReturnEnum.getName());
			return null;
		} else {
			return "redirect:"+url;
		}
	}
}
