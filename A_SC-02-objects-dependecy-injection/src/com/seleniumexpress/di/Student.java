package com.seleniumexpress.di;

public class Student {
	
	MathCheat cheat;
	
	 public void setCheat(MathCheat cheat) {
		this.cheat = cheat;
	}
	public void cheating()
	 {
		 System.out.println("calling cheating method");
		 cheat.Mathcheat();
	 }

}
