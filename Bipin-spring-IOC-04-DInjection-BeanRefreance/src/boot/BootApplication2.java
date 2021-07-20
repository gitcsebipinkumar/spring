package boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Address;
import service.UserIdentity;

public class BootApplication2 {


	public static void main(String[] args) {
		
		
		//Loading multiple files code in single xml
		String springFileLocation = "resources/spring-all-module.xml";
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(springFileLocation);
		
		Address add = (Address) applicationContext.getBean("ADD");
		
		UserIdentity userIdentity = (UserIdentity) applicationContext.getBean("UI");
		
		userIdentity.printuserIdentityVlaues();
	}
}
