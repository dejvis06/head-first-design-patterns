package com.example.chapter6;

import com.example.chapter6.abstraction.Command;

public class RemoteControl {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void runCommand() {
        command.execute();
    }

    public void undoCommand() {
        command.undo();
    }
}
