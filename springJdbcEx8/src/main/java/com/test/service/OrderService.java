package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.test.dao.OrderDAO;
import com.test.entity.Order;

@Component
public class OrderService {
	@Autowired
	private OrderDAO orderDao;
	
	@Transactional
	public void createOrder(Order order) {
		orderDao.createOrder(order);
	}
}
