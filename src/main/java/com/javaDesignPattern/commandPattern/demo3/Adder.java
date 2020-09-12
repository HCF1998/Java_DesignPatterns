package com.javaDesignPattern.commandPattern.demo3;

public class Adder {
    private int num =0; //定义初始值为0
    //加法操作，每次将传入的值与num作加法运算，再将结果返回
    public int add(int value){
        num+=value;
        return num;
    }
}
