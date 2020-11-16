package com.company;

//Task4_2
public class RedApplesFactory extends AbstractFabric {
    @Override
    Fruit makeFruit() {
        return new Apple("Красное");
    }
}
