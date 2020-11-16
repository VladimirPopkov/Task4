package com.company;

import java.util.Random;

//Task4_2
public class LongPinepplesFactory extends AbstractFabric {
    private Random random = new Random(10);

    @Override
    Fruit makeFruit() {
        return new Pineapple(random.nextInt());
    }
}
