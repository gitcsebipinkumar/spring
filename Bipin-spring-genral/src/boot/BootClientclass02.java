package boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import service.PrintIdentity;

public class BootClientclass02 {
	public BootClientclass02() {
		
	}
	
	public static void main(String[] args) {
		
	
		//Find xml file 
				String springFileLocation = "resources/Spring.xml";
				
				//load xml to IOC container using ApplictaionContext : early initialization - load on startup
				ApplicationContext applicationContext = new ClassPathXmlApplicationContext(springFileLocation);
				
				//create object of printName class 
				
				PrintIdentity printName  = (PrintIdentity) applicationContext.getBean("p");
				PrintIdentity printName02  = (PrintIdentity) applicationContext.getBean("p");
				PrintIdentity printName03  = (PrintIdentity) applicationContext.getBean("p");
				PrintIdentity printName04  = (PrintIdentity) applicationContext.getBean("p");
				
				//changes scope for one object
				
				printName.printAddress();
				printName.printAddress();
				
	}

}
