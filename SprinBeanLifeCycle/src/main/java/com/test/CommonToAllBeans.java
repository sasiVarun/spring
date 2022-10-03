package com.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CommonToAllBeans implements BeanPostProcessor{
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Inside postProcessBeforeInitialization method | BeanName: " + beanName + " | Bean: " + bean);
		return bean;
	}
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		System.out.println("Inside postProcessAfterInitialization method | BeanName: " + beanName + " | Bean: " + bean);
		System.out.println("===============================");
		return bean;
	}

}
