package com.javaDesignPattern.facadePattern.demo1;

/**
 * 子系统：计算字数
 */
public class CheckWord {
    //基本金额
    public final int basicAmount = 85;
    //广告内容
    String advertisement;
    int amount;
    public CheckWord (String advertisement){
        this.advertisement = advertisement;
    }
    //返回金额：字数+基本金额
    public int getAmount(){
        return advertisement.length()+basicAmount;
    }
    public String getAdvertisement(){
        return advertisement;
    }
}
