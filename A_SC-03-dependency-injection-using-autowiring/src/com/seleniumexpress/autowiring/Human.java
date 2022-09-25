package com.seleniumexpress.autowiring;

public class Human {
	
	Heart heart;

	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	public void startPumping()
	{
		if(heart!=null)
		{
		heart.pump();
		System.out.println("Started pumping");
		}
		else
		System.out.println("You are dead");
	}
	
	

}
