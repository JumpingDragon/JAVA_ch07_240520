package com.jumpingdragon.abstr;

public abstract class Phone {
	
	public String owner;

	public Phone(String owner) {
		super();
		this.owner = owner;
	}
	
	public abstract void turnOn();
	
	public abstract void turnOff();
	
}
