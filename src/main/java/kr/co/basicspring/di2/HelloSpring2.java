package kr.co.basicspring.di2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import kr.co.basicspring.di2.MessageEn2;
import kr.co.basicspring.di2.MessageKo2;

public class HelloSpring2 {

	public static void main(String[] args) {
		// 스프링빈을 이용한 객체 생성
		Resource resource=new ClassPathResource("spring.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		
		MessageKo2 korea=(MessageKo2) factory.getBean("msgKo");
		korea.sayHello("무궁화");
		
		MessageEn2 english=(MessageEn2) factory.getBean("msgEn");
		english.sayHello("Trump");
		
		

	}//main() end
}//class end
