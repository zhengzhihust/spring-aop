package com.eric.jimiopen.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eric.jimiopen.modules.register.service.MemberRegisterService;

@Controller
@RequestMapping("/login")
public class LoginAct {

	@Autowired
	MemberRegisterService memberRegisterService;
	
	@RequestMapping("index")
	public String index(HttpServletRequest request,HttpServletResponse response){
		return "login/index";
	}

}
