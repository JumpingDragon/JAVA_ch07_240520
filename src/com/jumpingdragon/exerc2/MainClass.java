package com.jumpingdragon.exerc2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company com = new Company();
		com.name = "홍길동";
		com.human = new Human();
		com.human = new Student();
		
		/* 필드의 다형성 */
		com.human1 = new Student(); // 업캐스팅
		com.human2 = new Worker(); // 업캐스팅
		com.human3 = new Soldier(); // 업캐스팅
		
		Human hun = new Worker(); // 업캐스팅
		com.work(hun);
	}

}
