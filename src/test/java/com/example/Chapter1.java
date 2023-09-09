package com.example;

import com.example.chapter1.MallardDuck;
import com.example.chapter1.ModelDuck;
import com.example.chapter1.abstraction.Duck;
import com.example.chapter1.fly.FlyRocketPowered;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Chapter1 {

    @Test
    void contextLoads() {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

}
