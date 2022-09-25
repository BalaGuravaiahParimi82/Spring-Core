package com.seleniumexpress.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	@Autowired
	@Qualifier("Octopusheart")
	private Heart heart;
	
	public Human()
	{
		System.out.println("This is a default constructor");
	}

	public void startPumping() {
		
		if(heart!=null)
		{
		heart.pump();
		System.out.println("Name of the Animal is : " + heart.getNameOfAnimal() + ".\nNo if heart(s) is : " + heart.getNoOfHeart());
		}
		
		else
			System.out.println("You are dead");
	}

}
