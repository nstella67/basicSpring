package kr.co.basicspring.di4;

import javax.swing.JOptionPane;

import kr.co.basicspring.di3.IHello;

public class MessageEn4 implements IHello{

	public MessageEn4() {
		System.out.println("MessageEn4() 객체 생성...");
	}//기본생성자
	
	public void sayHello(String name) {
		JOptionPane.showMessageDialog(null, "Hello~"+name);
		
	}

}
