package com.example.chapter1;

import com.example.chapter1.abstraction.Duck;
import com.example.chapter1.fly.FlyNoWay;
import com.example.chapter1.quack.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I’m a model duck");
    }
}