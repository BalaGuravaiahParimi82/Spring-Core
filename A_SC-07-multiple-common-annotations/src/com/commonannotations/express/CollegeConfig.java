package com.commonannotations.express;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {
	
	@Bean
	public College collegeconfig()
	{
		return new College();
	}
	
	@Bean
	public Principal principalconfig()
	{
		return new Principal();
		
	}
	
	

}
