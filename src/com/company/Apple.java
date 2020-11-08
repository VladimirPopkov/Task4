package com.company;

import java.util.Random;

public class Apple extends Fruit {
    private String color;
    private String[] appleColor = {"Красное", "Зеленое", "Желтое"};
    private Random random = new Random();

    public Apple(){
        super();
        this.color = appleColor[random.nextInt(4)];
    }

    public String toString(){
        return color + " яблоко" + super.toString();
    }
}
