package com.moonbc.example;


import com.moonbc.example.orthogonality.Main_Orthogonality;
import com.moonbc.example.simuduck.Duck;
import com.moonbc.example.simuduck.FlyBehavior;
import com.moonbc.example.simuduck.FlyNoWay;
import com.moonbc.example.simuduck.MallardDuck;
import com.moonbc.example.starbuzzcoffee.Beverage;
import com.moonbc.example.starbuzzcoffee.DarkRoast;
import com.moonbc.example.starbuzzcoffee.Espresso;
import com.moonbc.example.starbuzzcoffee.Mocha;
import com.moonbc.example.weatherstation.CurrentConditionsDisplay;
import com.moonbc.example.weatherstation.ForecastDisplay;
import com.moonbc.example.weatherstation.WeatherData;

public class Example_main {

    public static void main(String[] args) {

//        Main_Orthogonality main_Orthogonality= new Main_Orthogonality();
//        main_Orthogonality.excute();
    	
//    	Duck mallardDuck = new MallardDuck();
//    	
//    	mallardDuck.performFly();
//    	mallardDuck.setFlyBehavior(new FlyNoWay());
//    	
//    	mallardDuck.performFly();
        
//        WeatherData weatherData = new WeatherData();
//        
//        CurrentConditionsDisplay currentDisplay = 
//            new CurrentConditionsDisplay(weatherData);
////        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
//
//        weatherData.setMeasurements(80, 65, 30.4f);
//        weatherData.setMeasurements(82, 70, 29.2f);
//        weatherData.setMeasurements(78, 90, 29.2f);
       
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() 
				+ " $" + beverage.cost());
 
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() 
				+ " $" + beverage2.cost());
// 
//		Beverage beverage3 = new HouseBlend();
//		beverage3 = new Soy(beverage3); 
//		beverage3 = new Mocha(beverage3);
//		beverage3 = new Whip(beverage3);
//		System.out.println(beverage3.getDescription() 
//				+ " $" + beverage3.cost());
    	
    	
    	
    }
}
