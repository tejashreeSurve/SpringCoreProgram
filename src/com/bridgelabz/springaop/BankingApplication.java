package com.bridgelabz.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
// java base annotation
public class BankingApplication {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
	Logic object=context.getBean(Logic.class);
	object.logicLog();
	
	object.logicOfTransaction();

	object.logicOfAuthentication();
	}
}
