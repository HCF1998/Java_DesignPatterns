package com.javaDesignPattern.commandPattern.demo2;

/**
 * 功能键类，充当请求调用者（请求发送者）
 */
public class FunctionButton {
    private Command command;//维持一个抽象命令对象的引用

    //为功能键注入命令
    public void setCommand(Command command){
        this.command = command;
    }

    //发送请求的方法
    public void click(){
        System.out.println("单击功能键：");
        command.execute();
    }
}
