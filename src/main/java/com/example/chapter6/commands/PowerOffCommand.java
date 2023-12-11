package com.example.chapter6.commands;

import com.example.chapter6.abstraction.Command;
import com.example.chapter6.devices.types.PowerSwitch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PowerOffCommand implements Command {

    private static final Logger log = LoggerFactory.getLogger(PowerOffCommand.class);

    private final PowerSwitch powerSwitch;

    public PowerOffCommand(PowerSwitch powerSwitch) {
        this.powerSwitch = powerSwitch;
    }

    @Override
    public void execute() {
        powerSwitch.off();
        log.info("Turning off power switch: {}", powerSwitch);
    }

    @Override
    public void undo() {
        log.info("Undoing operation on power switch: {}", powerSwitch);
        if (!this.powerSwitch.isState())
            powerSwitch.on();
        else
            throw new RuntimeException("Cannot support operation, Power is on");
    }
}
