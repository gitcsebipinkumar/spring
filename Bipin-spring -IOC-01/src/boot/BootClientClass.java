package boot;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import service.Address;




public class BootClientClass {

	public BootClientClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		//Find xml file 
		String springFileLocation = "resources/Spring.xml";
		Resource resource = new ClassPathResource(springFileLocation);
		
		//load xml to IOC container using bean factory : lazy intialization
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		System.out.println("XML validated : document valid");
		
	    beanFactory.getBean("tt");
	
	
		
	}

}
