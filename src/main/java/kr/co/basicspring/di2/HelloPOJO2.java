package kr.co.basicspring.di2;

public class HelloPOJO2 {

	public static void main(String[] args) {
		// POJO 방식
		MessageKo2 korea=new MessageKo2();
		korea.sayHello("김연아");
		
		MessageEn2 english=new MessageEn2();
		english.sayHello("TOM");
	}//main() end
}//class end
