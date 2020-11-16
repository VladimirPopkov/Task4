package com.company;

import java.util.Random;

public class Orange extends Fruit{
    private int peelThickness;
    private Random random = new Random();

    public Orange(){
        super();
        this.peelThickness = random.nextInt(21);
    }
    //Task4_2 Constructor
    public Orange(int peelThickness){
        this.peelThickness = peelThickness;
    }

    public String toString(){
        return "Апельсин с толщиной кожуры " + peelThickness  + super.toString();
    }
}
