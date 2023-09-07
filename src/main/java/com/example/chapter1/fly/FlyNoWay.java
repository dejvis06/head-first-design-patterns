package com.example.chapter1.fly;

import com.example.chapter1.abstraction.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can’t ﬂy");
    }
}
