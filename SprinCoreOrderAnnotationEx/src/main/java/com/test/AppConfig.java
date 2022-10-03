package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan
public class AppConfig {
	
	@Bean @Order(3)
	public Product product() {
		return new Product("Pen");
	}
	
	@Bean @Order(1)
	public Product product1() {
		return new Product("Book");
	}
	
	@Bean @Order(2)
	public Product product2() {
		return new Product("Highlighter");
	}

}
