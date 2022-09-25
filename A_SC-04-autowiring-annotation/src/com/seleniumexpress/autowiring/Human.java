package com.seleniumexpress.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	@Autowired
	@Qualifier("Octopusheart")
	Heart heart;
	
	public void pump()
	{
		heart.pumping();
	}
}
