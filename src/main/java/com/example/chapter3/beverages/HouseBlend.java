package com.example.chapter3.beverages;

import com.example.chapter3.abstraction.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return .89;
    }
}