package com.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class AppBean implements BeanPostProcessor{
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Inside postProcessBeforeInitialization: "+ beanName + "\nBean:" + bean);
		return bean;
	}

}
