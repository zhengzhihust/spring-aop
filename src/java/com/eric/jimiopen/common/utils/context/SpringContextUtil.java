package com.eric.jimiopen.common.utils.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 
 * 获取bean工具类
 * 
 * @author fengli
 * @date 2013-3-19 下午8:05:03
 * 
 */
public class SpringContextUtil implements ApplicationContextAware {

	// Spring应用上下文环境
	private static ApplicationContext applicationContextt;

	/**
	 * 实现ApplicationContextAware接口的回调方法，设置上下文环境
	 * 
	 * @param applicationContext
	 */
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		SpringContextUtil.applicationContextt = applicationContext;
	}
	
	/**
	 * 获取对象 这里重写了bean方法，起主要作用
	 * 
	 * @param name
	 * @return Object 一个以所给名字注册的bean的实例
	 * @throws BeansException
	 */
	public static Object getBean(String name) throws BeansException {
		return applicationContextt.getBean(name);
	}
	
	/**
	 * 获取对象 这里重写了bean方法，起主要作用
	 * 
	 * @param clazz
	 * @return Object 一个以所给名字注册的bean的实例
	 * @throws BeansException
	 */
	public static <T> T getBean(Class<T> clazz) throws BeansException {
		return (T)applicationContextt.getBean(clazz);
	}

}
