package com.jumpingdragon.exerc;

public class Cat extends Animal{ //Animal 클래스 상속받음
	String catName;
	
	public void catwalking() {
		System.out.println("꽁꽁 얼어붙은 한강 위로 고양이가 걸어갑니다.");
	}
	
	@Override
	public void cry() {
		System.out.println("야옹");
	}
}
