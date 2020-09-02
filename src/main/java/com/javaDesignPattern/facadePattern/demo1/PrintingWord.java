package com.javaDesignPattern.facadePattern.demo1;

public class PrintingWord {
    CheckWord checkWord;
    public PrintingWord(CheckWord checkWord){
        this.checkWord = checkWord;
    }
    public void printing(){
        System.out.println("广告排版");
        System.out.println("-------");
        System.out.println(checkWord.getAdvertisement());
        System.out.println("-------");
    }
}
