package com.bipin.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect
{

	@Before("allGetters() && allCircleAdvice()")
	public void LoggingAdvice( JoinPoint joinPoint) {
		System.out.println(" *******All circle method advise ******" + joinPoint.getTarget());
	}

	@Before("allGetters()*")
	public void LoggingSecondAdvice() {
		System.out.println("Calling advise for all getter  ");
	}
	
	@Pointcut("execution(* get*())")
  public void allGetters() {};
  
  @Pointcut("within(com.bipin.model.Circle)")
  public void allCircleAdvice() {};
}
