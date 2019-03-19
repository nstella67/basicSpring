package kr.co.basicspring.di2;

import javax.swing.JOptionPane;

public class MessageKo2 {

	public MessageKo2() {
		System.out.println("MessageKo2() 객체 생성...");
	}//기본생성자
	
	public void sayHello(String name) {
		JOptionPane.showMessageDialog(null, "안녕하세요"+name);
	}//Hello() end

}//class end
