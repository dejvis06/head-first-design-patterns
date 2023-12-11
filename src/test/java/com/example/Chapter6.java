package com.example;


import com.example.chapter6.RemoteControl;
import com.example.chapter6.devices.types.PowerSwitch;
import com.example.chapter6.commands.PowerOffCommand;
import com.example.chapter6.commands.PowerOnCommand;
import com.example.chapter6.devices.LightBulb;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Chapter6 {

    @Test
    void contextLoads() {

        RemoteControl remoteControl = new RemoteControl();

        // Type of operation:
        PowerSwitch powerSwitch = new LightBulb();

        PowerOnCommand powerOnCommand = new PowerOnCommand(new LightBulb());
        remoteControl.setCommand(powerOnCommand);
        remoteControl.runCommand();

        PowerOffCommand powerOffCommand = new PowerOffCommand(powerSwitch);
        remoteControl.setCommand(powerOffCommand);
        remoteControl.runCommand();
        remoteControl.undoCommand();
    }
}
