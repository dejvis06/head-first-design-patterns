package com.example.chapter6.devices;

import com.example.chapter6.abstraction.functions.PowerSwitch;

public class Light implements PowerSwitch {
    @Override
    public void on() {
        System.out.println("Light is on!");
    }

    @Override
    public void off() {
        System.out.println("Light is off!");
    }
}
