package com.example.chapter1;

import com.example.chapter1.abstraction.Duck;
import com.example.chapter1.fly.FlyWithWings;
import com.example.chapter1.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
