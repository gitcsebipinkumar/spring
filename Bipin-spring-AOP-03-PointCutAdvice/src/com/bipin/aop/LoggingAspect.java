package com.bipin.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect
{

	@Before("allCircleAdvice()")
	public void LoggingAdvice() {
		System.out.println("***All circle method advise **  ");
	}

	@Before("allGetters()*")
	public void LoggingSecondAdvice() {
		System.out.println("Calling aspect 02 : ");
	}
	
	@Pointcut("execution(* get*())")
  public void allGetters() {};
  
  @Pointcut("within(com.bipin.model.Circle)")
  public void allCircleAdvice() {};
}
