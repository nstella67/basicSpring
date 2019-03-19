package kr.co.basicspring.di1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HelloSpring {

	public static void main(String[] args) {
		// 객체(Object)를 생성하는 방법
		//	→ 1) POJO 방식 : new 연산자
		//	→ 2) 자바빈 : <jsp:useBean id="" class="" />
		//	→ 3) 스프링빈 : XML을 이용한 의존관계(DI) 설정
		
		
		//스프링빈을 이용해서 객체 생성
		//1) 스프링빈 설정 XML 가져오기
		Resource resource=new ClassPathResource("spring.xml");
		
		//2) 팩토리빈 : 외부에서 작성한 스프링빈을 가져와서 접근 가능한 객체를 생성해 준다
		BeanFactory factory=new XmlBeanFactory(resource);		//줄 그어진 것:절판됨
		
		//3) 생성된 객체 가져오기
		//	<bean id="msgKo" class="kr.co.basicspring.di1.MessageKo">
		Object obj=factory.getBean("msgKo");
		MessageKo korea=(MessageKo)obj;
		korea.sayHello("누울");
		
//		<bean id="msgEn" class="kr.co.basicspring.di1.MessageEn">
			obj=factory.getBean("msgEn");
			MessageEn english=(MessageEn)obj;
			english.sayHello("Stella");
	}//main() end
}//class end
