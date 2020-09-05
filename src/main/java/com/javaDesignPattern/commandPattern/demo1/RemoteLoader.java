package com.javaDesignPattern.commandPattern.demo1;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        CellingFan cellingFan = new CellingFan();
        CellingFanHighCommand cellingFanHighCommand =
                new CellingFanHighCommand(cellingFan);
        CellingFanMediumCommand cellingFanMediumCommand =
                new CellingFanMediumCommand(cellingFan);
        CellingFanOffCommand cellingFanOffCommand = new CellingFanOffCommand(cellingFan);
        remoteControl.setCommand(cellingFanHighCommand);
        remoteControl.buttonWasPushed();
        remoteControl.setCommand(cellingFanMediumCommand);
        remoteControl.buttonWasPushed();
        remoteControl.setCommand(cellingFanOffCommand);
        remoteControl.buttonWasPushed();
        remoteControl.undoButtonWasPushed();
    }
}
