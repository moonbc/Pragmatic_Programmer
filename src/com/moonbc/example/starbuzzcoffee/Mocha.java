package com.moonbc.example.starbuzzcoffee;

public class Mocha extends CondimentDecorator{

	Beverage beverage;
	
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0;
	}

}
  