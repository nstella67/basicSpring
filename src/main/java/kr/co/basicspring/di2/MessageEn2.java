package kr.co.basicspring.di2;

import javax.swing.JOptionPane;

public class MessageEn2 {

	public MessageEn2() {
		System.out.println("MessageEn2() 객체 생성...");
	}//기본생성자
	
	public void sayHello(String name) {
		JOptionPane.showMessageDialog(null, "Hello~"+name);
		
	}

}
