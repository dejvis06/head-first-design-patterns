package com.example.chapter1.quack;

import com.example.chapter1.abstraction.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
