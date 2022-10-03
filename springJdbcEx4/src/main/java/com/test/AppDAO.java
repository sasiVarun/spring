package com.test;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

@Component
public class AppDAO {
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public int updateCustomer(Customer customer) {
		
		SqlParameterSource values = new MapSqlParameterSource()
										.addValue("customerId", customer.getCustomerId())
										.addValue("customerAddress", customer.getCustomerAddress());
		String sqlQuery = "update customer set customerAddress=:customerAddress where customerId=:customerId";
			
		int result=namedParameterJdbcTemplate.update(sqlQuery, values);
		return result;
	}
	
	public int deleteCustomer(Customer customer) {
		
		Map<String,Object> values = new LinkedHashMap<>();
		values.put("customerId", customer.getCustomerId());
		
		String sqlQuery = "delete from customer where customerId=:customerId";
		
		int result = namedParameterJdbcTemplate.update(sqlQuery, values);
		
		return result;
	}
}
