package com.javaDesignPattern.observerPattern.demo1;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private Subject weatherData;
    private float temperateure;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+temperateure+"F degress and "+ humidity
                            +"% humidity " + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        temperateure = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}