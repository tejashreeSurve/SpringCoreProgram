package com.bridgelabz.springaop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

// This class contain the extra method that need to be done
// advice :- @Before : this says what to execute before and after 
// point-cut:-  @Before(execution(method path)) :  this says after which method it should execute
@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {
	@Before("execution(public void logicLog())")
  public  void log() {
	  System.out.println("Log Maintained");
  }
	@After("execution(public void logicLog())")
  public void transcation() {
	  System.out.println("transaction done");
  }
	@After("execution(public void logicOfTransaction())")
  public void security() {
		  System.out.println("Security check");
  }
}
