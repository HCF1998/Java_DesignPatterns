package com.javaDesignPattern.commandPattern.demo3;

public class CalculatorForm {
    private AbstractCommand command;

    public void setCommand(AbstractCommand command){
        this.command = command;
    }

    public void compute(int value){
        int i= command.execute(value);
        System.out.println("本次运算结果为："+i);
    }

    public void undo(){
        int i = command.undo();
        System.out.println("撤销运算后结果为："+i);
    }
}
