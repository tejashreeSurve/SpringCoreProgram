package com.bridgelabz.autowiring;

public class Human {
	private Heart heart;

	// to autowire using constructor 
	// it can be done by by-name and by-type
	 public Human() {} //if we remove this non-argument constructor then error come  
	public Human(Heart heart) {
		this.heart = heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public void startPumping() {
		if (heart != null)
			heart.pumping();
		else
			System.out.println("you are dead");
	}
}
