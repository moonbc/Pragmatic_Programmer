package com.moonbc.example.weatherstation;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
