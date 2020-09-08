package com.javaDesignPattern.commandPattern.demo1;

/**
 * 抽象命令接口
 */
public interface Command {
    //执行命令
    public void execute();
    //撤销命令
    public void undo();
}
