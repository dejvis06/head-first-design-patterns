package com.example.chapter3.condiments;

import com.example.chapter3.abstraction.Beverage;
import com.example.chapter3.abstraction.CondimentDecorator;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .1;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
