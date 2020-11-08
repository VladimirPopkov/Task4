package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Fruit[] fruits = new Fruit[4];
        for (int i = 0; i < fruits.length; i++){
            fruits[i] = getRandomFruit(random.nextInt(3)+1);
            System.out.println(fruits[i].toString());
        }
    }

    static Fruit getRandomFruit(int fruitNumber){
        switch (fruitNumber){
            case 1:
                return new Apple();
            case 2:
                return new Orange();
            case 3:
                return new Pineapple();
            default:
                return null;
        }
    }
}
