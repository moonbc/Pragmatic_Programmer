package com.moonbc.example.simuduck;

public abstract class Duck {

	FlyBehavior flyBehavior;
	
	public Duck(){
		
	}

	public void performFly(){
		flyBehavior.fly();
	}
	
	public void swim() {
		
	}
	
	public void setFlyBehavior(FlyBehavior fb){
		flyBehavior = fb;
	}
	
	public abstract void display();

}
