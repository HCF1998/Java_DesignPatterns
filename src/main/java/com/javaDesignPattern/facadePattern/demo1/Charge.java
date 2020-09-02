package com.javaDesignPattern.facadePattern.demo1;

/**
 * 子系统类：计算费用
 */
public class Charge {
    public final int basicCharge=12;
    CheckWord checkWord;
    public Charge(CheckWord checkWord){
        this.checkWord = checkWord;
    }
    public void totalCharge(){
        //getAmount():advertisement.length()+basicAmount;
        System.out.println("广告费用："+checkWord.getAmount()*basicCharge+"元");
    }
}
