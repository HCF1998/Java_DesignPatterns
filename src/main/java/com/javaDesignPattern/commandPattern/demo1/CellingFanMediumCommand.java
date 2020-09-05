package com.javaDesignPattern.commandPattern.demo1;

public class CellingFanMediumCommand implements Command {
    CellingFan cellingFan;
    int preSpeed;
    public CellingFanMediumCommand(CellingFan cellingFan) {
        this.cellingFan = cellingFan;
    }

    @Override
    public void execute() {
        preSpeed = cellingFan.getSpeed();
        cellingFan.medium();
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
