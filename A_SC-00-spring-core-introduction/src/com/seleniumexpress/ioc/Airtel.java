package com.seleniumexpress.ioc;

public class Airtel implements Sim{
	
	Airtel()
	{
		System.out.println("Airtel Constructor called");
	}
	

	@Override
	public void calling() {
		System.out.println("Calling using Airtel Mobile");	
	}

	@Override
	public void data() {
		System.out.println("Browsing internet using Airtel Mobile");
		
	}
	
	

}
