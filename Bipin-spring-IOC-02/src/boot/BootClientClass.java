package boot;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.Name;




public class BootClientClass {

	public BootClientClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		//Find xml file 
		String springFileLocation = "resources/Spring.xml";
		
		//load xml to IOC container using ApplictaionContext : early initialization - load on startup
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(springFileLocation);
		
		System.out.println("XML validated : document valid");
		
		Name name = (Name) applicationContext.getBean("tt");
		name.printCompleteName("Bipin");
	
	
		
	}

}
