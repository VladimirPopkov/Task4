package com.company;

public class Pineapple extends Fruit{
    private int tailHeight;

    public Pineapple(int weight, int tailHeight){
        super(weight);
        this.tailHeight = tailHeight;
    }

    public String toString(){
        return "Ананас с высотой хвоста " + tailHeight  + super.toString();
    }
}
