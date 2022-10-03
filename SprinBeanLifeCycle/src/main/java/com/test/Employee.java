package com.test;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Employee implements BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {
	private Department department;

	public Employee() {
		System.out.println("\"Value of department from Employee Constructor:\" " + department);
	}

	public Department getDepartment() {
		return department;
	}

	@Autowired
	public void setDepartment(Department department) {
		this.department = department;
		System.out.println("\"Value of department from setDepartment method:\" " + department);
	}

	@PostConstruct
	public void afterConstructor() {
		System.out.println("Calling @PostConstruct annotated method.");
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("\"Bean id:\" " + beanName);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("\"ApplicationContext value:\" " + applicationContext);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside afterPropertiesSet method part of InitializingBean");
	}

	public void initMethod() {
		System.out.println("Inside init-method");
	}

	@PreDestroy
	public void beforeDestroy() {
		System.out.println("Calling @PreDestroy annotated method");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy method part of DisposableBean");
	}

}
