package kr.co.basicspring.di3;

public class HelloPOJO3 {

	public static void main(String[] args) {
		// POJO 방식
		
		IHello hello=null;
		
		hello=new MessageKo3();		//다형성
		hello.sayHello("박지성");
		
		hello=new MessageEn3();
		hello.sayHello("TOM");

	}//main() end

}//class end
