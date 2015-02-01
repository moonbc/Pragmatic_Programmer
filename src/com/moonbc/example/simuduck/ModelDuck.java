package com.moonbc.example.simuduck;

public class ModelDuck extends Duck{

	public ModelDuck(){
		flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
}
