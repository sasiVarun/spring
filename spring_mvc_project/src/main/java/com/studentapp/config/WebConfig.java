package com.studentapp.config;

import java.util.concurrent.TimeUnit;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
//@ComponentScan will scan for the @Controller(child interface of 
//@Component) and give it to the spring applicatom context
//to create the objects
@ComponentScan(basePackages="com.studentapp")
@EnableWebMvc
//@EnableWebMvc is equal to <mvc:annotation-driven />
@EnableTransactionManagement
//@EnableTransactionManagement annotation that enables 
//transaction support 
//to the application
public class WebConfig  implements WebMvcConfigurer {
	
	@Bean
	public DataSource dataSource() {
		//3rd party data source for connection pooling
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		try {
			dataSource.setDriverClass("com.mysql.jdbc.Driver");
			dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/studentmvcappdb");
			dataSource.setUser("root");
			dataSource.setPassword("secret");
			dataSource.setMinPoolSize(5);
			dataSource.setMaxPoolSize(20);
			dataSource.setMaxIdleTime(30000);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return dataSource;
	}
	
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		//passing datasource bean to jdbctemplate,
		//jdbctemplate will use connections from
		//the datasource connection pool
		//and execute the sql operations
		return new JdbcTemplate(dataSource());
	}

	//this is a bean that is used for transaction management
	//it works with @Transactional for commit, rollback operations
	//all the ACID properties are managed by transaction manager
	@Bean
	public DataSourceTransactionManager transactionManager() {
		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
		transactionManager.setDataSource(dataSource());
		return transactionManager;
	}
	
	@Bean
	public ViewResolver jspViewResolver() {
		InternalResourceViewResolver viewResolver = new 
				InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
	//this method maps static files to the url's as resources
		public void addResourceHandlers(ResourceHandlerRegistry registry){
			registry.addResourceHandler("/resources/**")
			.addResourceLocations("/resources/")
			.setCacheControl(CacheControl.maxAge(2, TimeUnit.HOURS).cachePublic());
		}
	
	
}
