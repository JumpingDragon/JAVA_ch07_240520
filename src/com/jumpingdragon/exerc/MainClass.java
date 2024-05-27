package com.jumpingdragon.exerc;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat cat1 = new Cat(); // cat1 객체가 선언됨.
		
		Animal anim = new Animal(); // 부모객체인 anim 객체 선언
		
		int a;
		byte b=10;
		a=b; // int는 4 byte니까 부모를 최소단위(자식)으로 쪼갤 수 있지.
//		b=a;// 이렇게 insert 하는 건 에러가 난다. 자식을 부모로 키울 순 없는 겨.
		// 부모 클래스 안에 5개 부품이 들어갈 정도의 공간이고
		// 자식 클래스 안에 그 5개 중 2개 부품이 들어갈 정도의 공간이라고 치자.
		// 자식 클래스에 들어갔던 부품을 부모에게 주면 들어가겠지만,
		// 부모 클래스에 들어갔던 부품을 자식에게 몽땅 주면 다 못 넣는다.
		
		/* 업캐스팅: 자식클래스의 객체가 부모클래스 타입으로 형변환 되는 것 */
		anim = cat1;
		
		/* 다운캐스팅: 부모클래스의 객체가 자식클래스 타입으로 형변환 되는 것. */
//		cat1 = anim; // 에러발생! 자동타입 변환이 안된다. 
		cat1 = (Cat) anim; // 임시 형변환으로 이 줄에서만 강제 타입변환 가능
		cat1.catwalking();
		
		
		Dog dog = new Dog();
		Tiger tiger = new Tiger();
		Cat cat2 = new Cat();
		
		Animal anim2 = new Dog(); // 업캐스팅이 일어남.
		
		Animal anim3 = new Animal();
		
		anim3 = new Dog();// Upcasting
		anim3 = new Tiger();
		anim3 = new Cat();
	}

}
