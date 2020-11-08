package com.company;

import java.util.Random;

public class Pineapple extends Fruit{
    private int tailHeight;
    private Random random = new Random();

    public Pineapple(){
        super();
        this.tailHeight = random.nextInt(16) + 5;
    }

    public String toString(){
        return "Ананас с высотой хвоста " + tailHeight  + super.toString();
    }
}
