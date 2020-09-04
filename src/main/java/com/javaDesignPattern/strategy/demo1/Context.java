package com.javaDesignPattern.strategy.demo1;

public class Context {
    private AbstractIdea abstractIdea;
    public void useIdea(AbstractIdea abstractIdea){
        this.abstractIdea = abstractIdea;
    }
    public void useDetailIdea(){
        System.out.print("使用锦囊：");
        abstractIdea.idea();
    }
}
