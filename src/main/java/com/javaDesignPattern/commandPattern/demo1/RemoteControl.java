package com.javaDesignPattern.commandPattern.demo1;

/**
 * 请求者
 */
public class RemoteControl {
    Command command;

    public RemoteControl() {
        Command noCommand = new NoCommand();
        command = noCommand;
    }

    public void setCommand (Command command){
        this.command = command;
    }
    public void buttonWasPushed(){
        command.execute();
    }
    public void undoButtonWasPushed(){
        command.undo();
    }
}
