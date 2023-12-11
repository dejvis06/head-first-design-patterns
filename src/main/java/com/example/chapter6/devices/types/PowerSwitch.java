package com.example.chapter6.devices.types;

public abstract class PowerSwitch {

    protected boolean state;

    public abstract void on();

    public abstract void off();

    public boolean isState() {
        return state;
    }
}
