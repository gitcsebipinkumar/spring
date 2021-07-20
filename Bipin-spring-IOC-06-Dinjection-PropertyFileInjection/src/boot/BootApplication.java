package boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.UserIdentity;

public class BootApplication {

	public static void main(String[] args) {
		
		//Loading multiple files code in single xml
				String springFileLocation = "resource/spring-useridentity.xml";
				
				ApplicationContext applicationContext = new ClassPathXmlApplicationContext(springFileLocation);
				
			
				UserIdentity userIdentity = (UserIdentity) applicationContext.getBean("UI");
				
				userIdentity.printUseridentity();
			}
}
