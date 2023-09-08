package com.example.chapter6.commands;

import com.example.chapter6.abstraction.Command;
import com.example.chapter6.abstraction.functions.PowerSwitch;

public class PowerOffCommand implements Command {

    private PowerSwitch powerSwitch;

    public PowerOffCommand(PowerSwitch powerSwitch) {
        this.powerSwitch = powerSwitch;
    }

    @Override
    public void execute() {
        powerSwitch.off();
    }
}
