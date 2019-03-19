package kr.co.basicspring.di1;

public class MessageKo {
	public MessageKo() {
		System.out.println("MessageKo() 객체 생성...");
	}//기본생성자
	
	public void sayHello(String name) {
		System.out.println("안녕하세요~"+name+"님!!");
	}
}//class end
