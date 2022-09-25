package com.commonannotations.express;

import org.springframework.beans.factory.annotation.Autowired;

public class College {
	
	@Autowired
	Principal principal;
	
	public void test()
	{
		System.out.println("Test method is working");
		principal.principalInfo();
	}
	
	

}
