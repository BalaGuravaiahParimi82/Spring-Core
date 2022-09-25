package com.seleniumExpress.ObjectInjection;

public class AnotherStudent {
	
	private int id;
	private Cheat cheat;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}
	
	public void cheating()
	{
		cheat.cheat();
	}

}
