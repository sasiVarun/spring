package com.test.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

import com.test.entity.Order;

@Component
public class OrderDAO {
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public void createOrder(Order order) {
		SqlParameterSource values = new MapSqlParameterSource()
										.addValue("orderid", order.getOrderId())
										.addValue("orderdetails", order.getOrderDetails())
										.addValue("productid", order.getProductId())
										.addValue("customerid", order.getCustomerId());
		
		String sqlQuery = "insert into orders values(:orderid,:orderdetails,:productid,:customerid)";
		namedParameterJdbcTemplate.update(sqlQuery, values);
		
		System.out.println("Inserted order");
	}
}
