package boot;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.BasicDataSource;

public class BootApplication {

	public static void main(String[] args) {
		
		//Loading multiple files code in single xml
				String springFileLocation = "resource/spring-useridentity.xml";
				
				ApplicationContext applicationContext = new ClassPathXmlApplicationContext(springFileLocation);
				
			
				BasicDataSource userIdentity = (BasicDataSource) applicationContext.getBean("datasource");
				
				userIdentity.printUseridentity();
			}
}
