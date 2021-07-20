package boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import model.A;
import model.B;
import model.C;
import service.UserIdentity;

public class BootApplication {


	public static void main(String[] args) {
		
		
		//Loading multiple files code in single xml
		String springFileLocation = "resource/spring.xml";
		
	
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(springFileLocation);
		
		A a = (A) applicationContext.getBean("A");
		B b = (B) applicationContext.getBean("B");
		C c = (C) applicationContext.getBean("C");
		
		
	}
}
