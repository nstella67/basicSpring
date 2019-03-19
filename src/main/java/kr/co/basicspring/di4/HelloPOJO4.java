package kr.co.basicspring.di4;

import kr.co.basicspring.di3.IHello;

public class HelloPOJO4 {

	public static void main(String[] args) {
		// POJO 방식
		
		IHello hello=null;
		
		hello=new MessageKo4();		//다형성
		hello.sayHello("박지성");
		
		hello=new MessageEn4();
		hello.sayHello("TOM");

	}//main() end

}//class end
