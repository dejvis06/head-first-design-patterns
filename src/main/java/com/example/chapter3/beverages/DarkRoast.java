package com.example.chapter3.beverages;

import com.example.chapter3.abstraction.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast(){
        this.description = "Dark roast";
    }
    @Override
    public double cost() {
        return 1.87;
    }
}
