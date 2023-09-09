package com.example;


import com.example.chapter3.abstraction.Beverage;
import com.example.chapter3.beverages.DarkRoast;
import com.example.chapter3.beverages.Espresso;
import com.example.chapter3.beverages.HouseBlend;
import com.example.chapter3.condiments.Mocha;
import com.example.chapter3.condiments.Soy;
import com.example.chapter3.condiments.Whip;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Chapter3 {

    @Test
    void contextLoads() {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());
    }
}
