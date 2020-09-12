package com.javaDesignPattern.commandPattern.demo3;

public class Client {
    public static void main(String[] args) {
        CalculatorForm calculatorForm = new CalculatorForm();
        AbstractCommand command = new AddCommand();
        calculatorForm.setCommand(command);

        calculatorForm.compute(8);
        calculatorForm.compute(9);
        calculatorForm.undo();
    }
}
