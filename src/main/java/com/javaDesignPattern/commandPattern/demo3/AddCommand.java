package com.javaDesignPattern.commandPattern.demo3;

public class AddCommand extends AbstractCommand {
    private Adder adder = new Adder();
    private int value;

    @Override
    public int execute(int value) {
        this.value = value;
        return adder.add(value);
    }

    @Override
    public int undo() {
        return adder.add(-value); //传入负数实现撤销操作
    }
}
