package com.jumpingdragon.interFace;

/*
 * 인터페이스는 추상 클래스보다 더 강력하게 추상 메서드 주장.
 * 인터페이스에서는 일반메소드로 선언해도 추상 메소드로 사용됨.
 * 모든 메소드가 추상 메소드이다.
 * 메소드 안에 body 내용을 넣을 수가 없다.
 */

public interface Car {// 인터페이스 선언
	
	final String modelName = "Galaxy"; //상수만 선언 가능. final. 변하지 않는 고정값.
	// final 생략 가능
	
	public void frontDrive(); //일반 메소드로 선언해도 추상메소드로 사용됨
	public void rearDrive(); //일반 메소드로 선언해도 추상메소드로 사용됨
	public void stop(); //일반 메소드로 선언해도 추상메소드로 사용됨
	public abstract void horn(); //일반 메소드로 선언해도 추상메소드로 사용됨
	// abstract가 생략될 뿐 써준다고 오류 뜨지 않음.
}
