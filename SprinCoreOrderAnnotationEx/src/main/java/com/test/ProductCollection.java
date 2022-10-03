package com.test;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ProductCollection implements BeanNameAware, ApplicationContextAware {
	@Autowired
	private List<Product> products;

	public ProductCollection(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "ProductCollection [products=" + products + "]";
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("ApplicationContext: " + applicationContext);

	}

	@Override
	public void setBeanName(String name) {
		System.out.println("Bean name: " + name);

	}

}
