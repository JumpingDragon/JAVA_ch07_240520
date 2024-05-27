package com.jumpingdragon.abstr;

public class SmartPhone extends Phone{

	public SmartPhone(String owner) {
		super(owner);
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	
	@Override
	public void turnOn() { // 추상 메소드를 상속받아서 반드시 오버라이딩 메소드를 써줌.
		System.out.println("터치로 전원을 켭니다.");
	}
	
	@Override
	public void turnOff() { // 추상 메소드를 상속받아서 반드시 오버라이딩 메소드를 써줌.
		System.out.println("터치로 전원을 끕니다.");
	}
	
}
