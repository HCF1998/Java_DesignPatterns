package com.javaDesignPattern.facadePattern.demo1;

/**
 * 本例模拟报社子系统：检查广告字数，计算费用吗，排版。
 * 一个用户需要登广告只需将广告内容交给报社即可。
 */

/**
 * 外观类
 */
public class ClientServerFacade {
    private CheckWord checkWord;
    private Charge charge;
    private PrintingWord printingWord;
    String advertisement;
    public ClientServerFacade(String advertisement){
        this.advertisement = advertisement;
        checkWord = new CheckWord(advertisement);
        charge = new Charge(checkWord);
        printingWord = new PrintingWord(checkWord);
    }

    public void doAdvertisement(){
        checkWord.getAmount();
        charge.totalCharge();
        printingWord.printing();
    }
}
