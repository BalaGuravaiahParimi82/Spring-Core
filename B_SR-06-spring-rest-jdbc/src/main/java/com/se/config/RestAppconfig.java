package com.se.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.se.config.dao.EmployeeDAO;
import com.se.config.dao.EmployeeDAOImpl;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com")
public class RestAppconfig {

	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(getDataSource());
	}
	
	@Bean
	public EmployeeDAO employeeDAO()
	{
		return new EmployeeDAOImpl();
	}

	@Bean
	public DataSource getDataSource() {

		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource("jdbc:mysql://localhost:3306/employee_data?useSSL=false", "root", "Balu");
		
		driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		return driverManagerDataSource;

	}
}
