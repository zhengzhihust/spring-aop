package com.eric.jimiopen.common.utils.dbutils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 
 * ��ȡbean������
 * 
 * @author fengli
 * @date 2013-3-19 ����8:05:03
 * 
 */
public class SpringContextUtil implements ApplicationContextAware {

	// SpringӦ�������Ļ���
	private static ApplicationContext applicationContextt;

	/**
	 * ʵ��ApplicationContextAware�ӿڵĻص����������������Ļ���
	 * 
	 * @param applicationContext
	 */
	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		// TODO Auto-generated method stub
		SpringContextUtil.applicationContextt = arg0;
		
	}
	/**
	 * ��ȡ���� ������д��bean����������Ҫ����
	 * 
	 * @param name
	 * @return Object һ�����������ע���bean��ʵ��
	 * @throws BeansException
	 */
	public static Object getBean(String name) throws BeansException {
		return applicationContextt.getBean(name);
	}
	
	/**
	 * ��ȡ���� ������д��bean����������Ҫ����
	 * 
	 * @param clazz
	 * @return Object һ�����������ע���bean��ʵ��
	 * @throws BeansException
	 */
	public static <T> T getBean(Class<T> clazz) throws BeansException {
		return (T)applicationContextt.getBean(clazz);
	}

	

}
