package com.example.chapter1.fly;

import com.example.chapter1.abstraction.behavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I’m ﬂying with a rocket!");
    }
}
