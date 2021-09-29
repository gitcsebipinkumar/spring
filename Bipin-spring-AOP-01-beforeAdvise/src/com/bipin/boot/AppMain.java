package com.bipin.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bipin.model.Circle;
import com.bipin.model.Triangle;
import com.bipin.service.ShapeService;

public class AppMain {

	public AppMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("resources/spring.xml");
		System.out.println("*********** Spring xml laoded succefully **************");
		
		ShapeService shapeservice = ctx.getBean("shapeServiceClass", ShapeService.class);
		System.out.println("Object :"+ shapeservice.getTriangle().getName());
		
		
	}

}

