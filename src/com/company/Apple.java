package com.company;

public class Apple extends Fruit {
    private String color;

    public Apple(int weight, String color){
        super(weight);
        this.color = color;
    }

    public String toString(){
        return color + " яблоко" + super.toString();
    }
}
