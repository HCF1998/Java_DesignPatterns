package com.javaDesignPattern.strategy.demo1;

public class UseIdeaTest {
    public static void main(String[] args) {
        Context context = new Context();
        AbstractIdea abstractIdea;

        System.out.println("使用锦囊1");
        abstractIdea = new IdeaDetailOne();
        context.useIdea(abstractIdea);
        context.useDetailIdea();

        System.out.println("使用锦囊2");
        abstractIdea = new IdeaDetailTwo();
        context.useIdea(abstractIdea);
        context.useDetailIdea();

        System.out.println("使用锦囊3");
        abstractIdea = new IdeaDetailThree();
        context.useIdea(abstractIdea);
        context.useDetailIdea();


    }
}
