package com.bridgelabz.springioc;

public class BMW implements Cars {

	@Override
	public void modelName() {
		System.out.println("Model-Name:- BMW");
	}

	@Override
	public void modelColour() {
		System.out.println("Model-Colour:- Grey");
	}
}
