package com.moonbc.example.simuduck;

/**
 * @author allornone
 *
 */
public class MallardDuck extends Duck {

	public MallardDuck() {
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("MallardDuck display");
	}

}
