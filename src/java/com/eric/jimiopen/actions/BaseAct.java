package com.eric.jimiopen.actions;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.coola.core.user.share.UserClient;
import com.coola.core.user.share.UserInfo;
import com.zhenai.commons.web.ResponseUtils;

public class BaseAct {
	
	/** �����: �ɹ� */
	protected static final int RESULT_OK = 1;
	/** �����: ���һҳ */
	protected static final int RESULT_END = 11;
	/** �����: ʧ�� */
	protected static final int RESULT_FAILED = -1;
	/** �����: �쳣 */
	protected static final int RESULT_ERROR = -11;
	//�������
	protected static final int PARAM_ERROR = 9;
	/** �����: ��¼ʧЧ */
	protected static final int RESULT_LOGIN_FAILED = -2;
	
	protected static final String STATUS_KEY = "status";
	protected static final String DATA_KEY = "data";
	protected static final String MSG_KEY = "msg";
	
	/**Ĭ������20��**/
	protected int defaultSize=10;
	
	protected Map<String, Object> results = new HashMap<String, Object>();
	
	public void putParamResult(HttpServletResponse response, int status, String msg){
		Map<String, Object> results = new HashMap<String, Object>();
		results.put(STATUS_KEY, status);
		results.put(MSG_KEY, msg);
		ResponseUtils.renderJson(response, JSON.toJSONString(results));
	}
	
	/**
	 * ��ӳɹ������Ϣ
	 * 
	 * @param msg ��ʾ��Ϣ
	 */
	public void putParamFailResult(HttpServletResponse response, String msg){
		Map<String, Object> results = new HashMap<String, Object>();
		results.put(STATUS_KEY, PARAM_ERROR);
		results.put(MSG_KEY, msg);
		ResponseUtils.renderJson(response, JSON.toJSONString(results));
	}
	
	/**
	 * ��ӳɹ������Ϣ
	 * 
	 * @param msg ��ʾ��Ϣ
	 */
	public void putSuccessResult(HttpServletResponse response,String msg) {
		Map<String, Object> results = new HashMap<String, Object>();
		results.put(STATUS_KEY, RESULT_OK);
		results.put(MSG_KEY, msg);
		ResponseUtils.renderJson(response, JSON.toJSONString(results));
	}
	
	/**
	 * ��ӳɹ������Ϣ
	 * 
	 * @param data ������
	 */
	public void putSuccessResult(HttpServletResponse response,Object data) {
		Map<String, Object> results = new HashMap<String, Object>();
		results.put(STATUS_KEY, RESULT_OK);
		results.put(DATA_KEY, data);
		ResponseUtils.renderJson(response, JSON.toJSONString(results));
	}
	
	/**
	 * ��ӳɹ������Ϣ
	 * 
	 * @param msg ��ʾ��Ϣ
	 * @param data ������
	 */
	public void putSuccessResult(HttpServletResponse response,String msg, Object data) {
		Map<String, Object> results = new HashMap<String, Object>();
		results.put(STATUS_KEY, RESULT_OK);
		results.put(MSG_KEY, msg);
		results.put(DATA_KEY, data);
		ResponseUtils.renderJson(response, JSON.toJSONString(results));
	}
	
	/**
	 * ���ĩҳ����״̬
	 */
	public void putEndPageResult(HttpServletResponse response) {
		Map<String, Object> results = new HashMap<String, Object>();
		results.put(STATUS_KEY, RESULT_END);
		ResponseUtils.renderJson(response, JSON.toJSONString(results));
	}
	
	/**
	 * ���ĩҳ����״̬
	 * 
	 * @param data ������
	 */
	public void putEndPageResult(HttpServletResponse response,Object data) {
		Map<String, Object> results = new HashMap<String, Object>();
		results.put(STATUS_KEY, RESULT_END);
		results.put(DATA_KEY, data);
		ResponseUtils.renderJson(response, JSON.toJSONString(results));
	}
	
	/**
	 * ���ʧ�ܽ����Ϣ.
	 * 
	 * @param msg ʧ����ʾ��Ϣ
	 */
	public void putLoginFailedResult(HttpServletResponse response,String msg) {
		Map<String, Object> results = new HashMap<String, Object>();
		results.put(STATUS_KEY, RESULT_LOGIN_FAILED);
		results.put(MSG_KEY, msg);
		ResponseUtils.renderJson(response, JSON.toJSONString(results));
	}
	
	/**
	 * ���ʧ�ܽ����Ϣ.
	 * 
	 * @param msg ʧ����ʾ��Ϣ
	 */
	public void putFailedResult(HttpServletResponse response,String msg) {
		Map<String, Object> results = new HashMap<String, Object>();
		results.put(STATUS_KEY, RESULT_FAILED);
		results.put(MSG_KEY, msg);
		ResponseUtils.renderJson(response, JSON.toJSONString(results));
	}
	/**
	 * ���ʧ�ܽ����Ϣ
	 * 
	 * @param msg ��ʾ��Ϣ
	 * @param data ������
	 */
	public void putFailedResult(HttpServletResponse response,String msg, Object data) {
		Map<String, Object> results = new HashMap<String, Object>();
		results.put(STATUS_KEY, RESULT_FAILED);
		results.put(MSG_KEY, msg);
		results.put(DATA_KEY, data);
		ResponseUtils.renderJson(response, JSON.toJSONString(results));
	}
	
	public void putFailedResult(HttpServletResponse response,Object data) {
		Map<String, Object> results = new HashMap<String, Object>();
		results.put(STATUS_KEY, RESULT_FAILED);
		results.put(DATA_KEY, data);
		ResponseUtils.renderJson(response, JSON.toJSONString(results));
	}
	
	public void putFailedResult(HttpServletResponse response,Map<String, Object> results) {
		ResponseUtils.renderJson(response, JSON.toJSONString(results));
	}
	
	protected String setInfo(HttpServletRequest request,String info){
		request.setAttribute("info", info);
		return "/common/info";
	}
	
	protected UserInfo getDefaultMaker(){
		UserInfo userInfo = null;
		try {
			userInfo=new UserClient().get(34533826, UserInfo.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userInfo;
	}
	
	protected UserInfo getDefaultMatcher(){
		UserInfo userInfo = null;
		try {
			userInfo=new UserClient().get(37437420, UserInfo.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userInfo;
	}
	
	protected UserInfo getDefaultMatchee(){
		UserInfo userInfo = null;
		try {
			userInfo=new UserClient().get(22595599, UserInfo.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userInfo;
	}
	
	public static String getRemoteIP(HttpServletRequest request) {
		String ipaddr = request.getHeader("X-nginx-real-ip");
		if(StringUtils.isNotBlank(ipaddr)) {
			return ipaddr;
		}
		
		ipaddr = request.getHeader("X-Real-IP");
		if(StringUtils.isNotBlank(ipaddr)) {
			return ipaddr;
		}
		
		ipaddr = request.getHeader("X-Forwarded-For");
		if(StringUtils.isNotBlank(ipaddr)) {
			return ipaddr;
		}
		
		ipaddr = request.getHeader("X-Remote-Addr");
		if(StringUtils.isNotBlank(ipaddr)) {
			return ipaddr;
		}
		
		ipaddr = request.getHeader("HTTP_X_FORWARDED_FOR");
		if(StringUtils.isNotBlank(ipaddr)) {
			return ipaddr;
		}
		
		ipaddr = request.getHeader("Proxy-Client-IP");
		if(StringUtils.isNotBlank(ipaddr)) {
			return ipaddr;
		}
		
		ipaddr = request.getHeader("WL-Proxy-Client-IP");
		if(StringUtils.isNotBlank(ipaddr)) {
			return ipaddr;
		}
		
		ipaddr = request.getHeader("HTTP_X_REAL_IP");
		if(StringUtils.isNotBlank(ipaddr)) {
			return ipaddr;
		}
		
		if (StringUtils.isBlank(ipaddr)) {
			ipaddr = request.getRemoteAddr();
		}
		return ipaddr;
	}

	public ModelAndView redirectLoginHtml(HttpServletRequest request, int type){
		ModelAndView view = new ModelAndView();
		view.setViewName("redirect:/login/loadpage.do?type=" + type);
		return view;
	}
	public String redirectLoginHtml(int type){
		return "redirect:/login/loadpage.do?type=" + type;
	}
}
