package com.example.chapter6.devices;

import com.example.chapter6.devices.types.PowerSwitch;

public class LightBulb extends PowerSwitch {

    private String id;

    public LightBulb() {
        this.id = "Kitchen-01";
        state = false;
    }

    @Override
    public void on() {
        state = true;
    }

    @Override
    public void off() {
        state = false;
    }

    @Override
    public String toString() {
        return "LightBulb{" +
                "id='" + id + '\'' +
                ", state=" + state +
                '}';
    }
}
