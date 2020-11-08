package com.company;

import java.util.Random;

public class Fruit {
    private int weight;
    private Random random = new Random();

    public Fruit(){
        this.weight = random.nextInt(200) + 100;
    }

    public String toString(){
        return " весом - " + weight;
    }
}
