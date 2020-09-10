package com.javaDesignPattern.commandPattern.demo2;

/**
 * 具体命令类：帮助命令
 */
public class HelpCommand {
    //维持对请求接收者的引用
    private DisplayHelpClass hcObj;

    public HelpCommand(DisplayHelpClass hcObj) {
        hcObj = new DisplayHelpClass();
    }

    //命令执行方法，将调用请求接收者的业务方法
    public void execute(){
        hcObj.display();
    }
}
