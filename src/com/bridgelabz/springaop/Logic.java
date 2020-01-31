package com.bridgelabz.springaop;

import org.springframework.stereotype.Component;

// this class contain entire Business logic
@Component
public class Logic {
	public void logicLog() {
		// if we want to track the logFile we have to call log method from Helper class
		// similar for transaction
		System.out.println("this is logic 1 method ");
	}
	public void logicOfTransaction() {
		System.out.println("this is logic of transcation");
	}
	
	public void logicOfAuthentication() {
		System.out.println("this is logic of authentication");
	}
	// like this we can have multiple methods with different logic
}
