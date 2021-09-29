package com.bipin.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect
{
/*
	@Before("execution(public String getName())")
	public void LoggingAdvice() {
		System.out.println("Calling aspect before method ");
	}
*/
	/*
	@Before("execution(public String com.bipin.model.Circle.getName())")
	public void LoggingAdviceSpecfictoClass() {
		System.out.println("Calling aspect before method ");
	}
	
	*/
	
	
	@Before("execution(public * get*())")
	public void LoggingAdviceSpecfictoClass() {
		System.out.println("Calling aspect before prefix whereever : get called");
	}
	
	
}
