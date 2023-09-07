package com.example.chapter1.quack;

import com.example.chapter1.abstraction.behavior.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
