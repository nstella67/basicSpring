package kr.co.basicspring.di3;

public class MessageKo3 implements IHello{

	public MessageKo3() {	//기본생성자
		System.out.println("MessageKo3() 객체 생성");
	}

	@Override
	public void sayHello(String name) {
		System.out.println("안녕하세요"+name);
		
	}
	
}//class end
