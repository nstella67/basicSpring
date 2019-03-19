package kr.co.basicspring.di4;

import javax.swing.JOptionPane;

import kr.co.basicspring.di3.IHello;

public class MessageKo4  implements IHello{

	public MessageKo4() {
		System.out.println("MessageKo4) 객체 생성...");
	}//기본생성자
	
	public void sayHello(String name) {
		JOptionPane.showMessageDialog(null, "안녕하세요"+name);
	}//Hello() end

}//class end
