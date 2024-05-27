package com.jumpingdragon.abstr;

public abstract class Car { // 추상 클래스
	String model;
	String color;
	int carAge;
	
	public abstract void drive(); //{
		//System.out.println("운전");
	//}
	
	public void horn() { // 경적
		System.out.println("빵빵");
	}
}
