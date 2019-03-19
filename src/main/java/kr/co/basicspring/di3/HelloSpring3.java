package kr.co.basicspring.di3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import kr.co.basicspring.di3.MessageEn3;
import kr.co.basicspring.di3.MessageKo3;

public class HelloSpring3 {

	public static void main(String[] args) {
		// 스프링빈을 이용한 객체 생성
		Resource resource=new ClassPathResource("spring2.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		
		IHello hello=null;
		hello=(IHello) factory.getBean("msgKo");
		hello.sayHello("김연아");
		
		hello=(IHello) factory.getBean("msgEn");
		hello.sayHello("Jane");		
		
		

	}//main() end
}//class end
