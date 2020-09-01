package com.javaDesignPattern.observerPattern.demo1;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(78,90,29.2f);
        weatherData.setMeasurements(82,70,30.2f);
    }
}
