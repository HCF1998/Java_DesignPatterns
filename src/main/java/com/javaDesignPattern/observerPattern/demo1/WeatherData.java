package com.javaDesignPattern.observerPattern.demo1;

import java.util.ArrayList;

public class WeatherData implements Subject {
    //存放观察者
    private ArrayList<Observer> observers;

    /**
     * 温度，湿度，气压
     */
    private float temperature;
    private float humidity;
    private float pressure;

    //引用观察者
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

    //通知观察者更新
    @Override
    public void notifyObservers() {
        for (int i=0;i<observers.size();i++){
            Observer observer = (Observer)observers.get(i);
            //更新数据
            observer.update(temperature,humidity,pressure);
        }
    }

    /**
     * 更新数据
     */
    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperateure,float humidity,float pressure){
        this.temperature = temperateure;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
