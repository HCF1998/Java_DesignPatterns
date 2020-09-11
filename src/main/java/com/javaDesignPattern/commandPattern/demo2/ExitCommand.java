package com.javaDesignPattern.commandPattern.demo2;

/**
 * 具体命令类：退出命令
 */
public class ExitCommand extends Command {
    //维持对请求接收者的引用
    private SystemExitClass seObj;

    public ExitCommand() {
        seObj = new SystemExitClass();
    }
    //命令执行方法，将调用请求接收者的业务方法
    public void execute(){
        seObj.exit();
    }
}
