package com.javaDesignPattern.commandPattern.demo1;

/**
 * 命令接口
 */
public interface Command {
    public void execute();
    public void undo();
}
