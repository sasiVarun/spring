package com.test.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.entity.Order;
import com.test.service.OrderService;

public class Runner {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		OrderService orderService = context.getBean(OrderService.class);
		
		Order order = new Order();
		
		order.setOrderId("Order1");
		order.setOrderDetails("First Order");
		order.setProductId("P123");
		order.setCustomerId("Customer1");
		
		orderService.createOrder(order);
		
	}

}
