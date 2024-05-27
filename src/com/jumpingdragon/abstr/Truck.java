package com.jumpingdragon.abstr;

public class Truck extends Car{
	
	//부모 클래스의 추상메소드는 반드시 오버라이딩해서 자식클래스에서 사용해야 함!
	@Override
	public void drive(){//Car 클래스의 추상메소드인 drive 메소드를 오버라이딩함.
	System.out.println("트럭 운전");
	}
}
