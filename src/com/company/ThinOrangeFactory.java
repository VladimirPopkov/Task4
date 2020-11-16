package com.company;

import java.util.Random;

//Task4_2
public class ThinOrangeFactory extends AbstractFabric {

    private Random random = new Random();
    @Override
    Fruit makeFruit() {
        return new Orange(random.nextInt(5)+1);
    }
}
