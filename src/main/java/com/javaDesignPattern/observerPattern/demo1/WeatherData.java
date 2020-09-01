package com.javaDesignPattern.observerPattern.demo1;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observers;

    private float temperateure;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i>=0)
            observers.remove(i);
    }

    @Override
    public void notifyObservers() {
        for (int i=0;i<observers.size();i++){
            Observer observer = (Observer)observers.get(i);
            observer.update(temperateure,humidity,pressure);
        }
    }

    /**
     * 更新数据
     */
    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperateure,float humidity,float pressure){
        this.temperateure = temperateure;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
