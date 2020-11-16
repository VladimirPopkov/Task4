package com.company;

//Task4_2
public class GreenApplesFactory extends AbstractFabric {
    @Override
    Fruit makeFruit() {
        return new Apple("Зеленое");
    }
}
