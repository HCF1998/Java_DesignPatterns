package com.javaDesignPattern.observerPattern.demo1;

/**
 * 主题接口：包含添加，删除观察者以及通知观察者添加数据的方法
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
