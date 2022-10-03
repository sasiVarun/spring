package com.test;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan
public class AppConfig {
	
	@Bean
	public DataSource dataSource() {
		/* define the connection pool */
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("sasi");
		dataSource.setPassword("sasi");
		dataSource.setInitialSize(10);
		dataSource.setMaxActive(100);
		return dataSource;
	}
	
	@Bean
	public JdbcTemplate jdbcTempalte() {
		
		return new JdbcTemplate(dataSource());
	}

}
