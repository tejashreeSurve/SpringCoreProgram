package com.bridgelabz.springioc;

public class TataMotor implements Cars {

	@Override
	public void modelName() {
		System.out.println("Model-Name:- TataMotor");
	}

	@Override
	public void modelColour() {
		System.out.println("Model-Colour:- Red");
	}
}
