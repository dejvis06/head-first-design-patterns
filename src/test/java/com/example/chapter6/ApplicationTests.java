package com.example.chapter6;


import com.example.chapter6.abstraction.functions.PowerSwitch;
import com.example.chapter6.commands.PowerOffCommand;
import com.example.chapter6.commands.PowerOnCommand;
import com.example.chapter6.devices.LightBulb;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Test
    void contextLoads() {

        RemoteControl remoteControl = new RemoteControl();

        // Type of operation:
        PowerSwitch powerSwitch = new LightBulb();

        PowerOnCommand powerOnCommand = new PowerOnCommand(powerSwitch);
        remoteControl.setCommand(powerOnCommand);
        remoteControl.runCommand();

        PowerOffCommand powerOffCommand = new PowerOffCommand(powerSwitch);
        remoteControl.setCommand(powerOffCommand);
        remoteControl.runCommand();
    }
}
