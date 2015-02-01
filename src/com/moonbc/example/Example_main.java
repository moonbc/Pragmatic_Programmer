package com.moonbc.example;


import com.moonbc.example.orthogonality.Main_Orthogonality;
import com.moonbc.example.simuduck.Duck;
import com.moonbc.example.simuduck.FlyBehavior;
import com.moonbc.example.simuduck.FlyNoWay;
import com.moonbc.example.simuduck.MallardDuck;

public class Example_main {

    public static void main(String[] args) {

//        Main_Orthogonality main_Orthogonality= new Main_Orthogonality();
//        main_Orthogonality.excute();
    	
    	Duck mallardDuck = new MallardDuck();
    	
    	mallardDuck.performFly();
    	mallardDuck.setFlyBehavior(new FlyNoWay());
    	
    	mallardDuck.performFly();
        
    }
}
