package com.example.chapter6.commands;

import com.example.chapter6.abstraction.Command;
import com.example.chapter6.abstraction.functions.PowerSwitch;

public class PowerOnCommand implements Command {

    private PowerSwitch powerSwitch;

    public PowerOnCommand(PowerSwitch powerSwitch) {
        this.powerSwitch = powerSwitch;
    }

    @Override
    public void execute() {
        powerSwitch.on();
    }
}
