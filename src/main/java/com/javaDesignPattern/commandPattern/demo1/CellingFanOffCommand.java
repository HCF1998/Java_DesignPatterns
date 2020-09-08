package com.javaDesignPattern.commandPattern.demo1;

/**
 * 不同速度的具体命令
 */
public class CellingFanOffCommand implements Command {
    CellingFan cellingFan;
    int preSpeed;
    public CellingFanOffCommand(CellingFan cellingFan) {
        this.cellingFan = cellingFan;
    }

    @Override
    public void execute() {
        preSpeed = cellingFan.getSpeed();
        cellingFan.off();
    }

    @Override
    public void undo() {
        if (preSpeed == CellingFan.HIGH){
            cellingFan.high();
        }else if (preSpeed ==CellingFan.MEDIUM){
            cellingFan.medium();
        }else if (preSpeed ==CellingFan.LOW){
            cellingFan.low();
        }else if (preSpeed ==CellingFan.OFF){
            cellingFan.off();
        }
    }
}
