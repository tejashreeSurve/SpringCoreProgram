package com.bridgelabz.springioc;

public class Alto implements Cars {

	@Override
	public void modelName() {
		System.out.println("Model-Name:- Alto");
	}

	@Override
	public void modelColour() {
		System.out.println("Model-Colour:- White");
	}
}
