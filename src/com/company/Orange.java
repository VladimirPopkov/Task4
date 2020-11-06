package com.company;

public class Orange extends Fruit{
    private int peelThickness;

    public Orange(int weight, int peelThickness){
        super(weight);
        this.peelThickness = peelThickness;
    }

    public String toString(){
        return "Апельсин с толщиной кожуры " + peelThickness  + super.toString();
    }
}
