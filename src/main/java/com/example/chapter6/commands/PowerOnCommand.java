package com.example.chapter6.commands;

import com.example.chapter6.abstraction.Command;
import com.example.chapter6.devices.types.PowerSwitch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PowerOnCommand implements Command {

    private static final Logger log = LoggerFactory.getLogger(PowerOffCommand.class);

    private final PowerSwitch powerSwitch;

    public PowerOnCommand(PowerSwitch powerSwitch) {
        this.powerSwitch = powerSwitch;
    }

    @Override
    public void execute() {
        powerSwitch.on();
        log.info("Turned on power switch: {}", powerSwitch);
    }

    @Override
    public void undo() {
        log.info("Undoing operation on power switch: {}", powerSwitch);
        if (this.powerSwitch.isState())
            powerSwitch.off();
        else
            throw new RuntimeException("Cannot support operation, Power is off");
    }
}
