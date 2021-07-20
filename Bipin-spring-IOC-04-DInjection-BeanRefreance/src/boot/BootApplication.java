package boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Address;
import service.UserIdentity;

public class BootApplication {

	
	public static void main(String[] args) {
		
		//Loading multiple files code
		String files[] = new String[] {"resources/spring-address.xml" ,"resources/spring-useridentity.xml"};
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(files);
		
		Address add = (Address) applicationContext.getBean("ADD");
		
		UserIdentity userIdentity = (UserIdentity) applicationContext.getBean("UI");
		
		userIdentity.printuserIdentityVlaues();
	}

}
