package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Fruit[] fruits = new Fruit[4];
        AbstractFabric[] fabrics = new AbstractFabric[10]; //Task4_2
        Fruit[] fruitsFactory = new Fruit[20]; //Task4_2
        int fabricNumber = 1; //Task4_2
        for (int i = 0; i < fruits.length; i++){
            fruits[i] = getRandomFruit(random.nextInt(3)+1);
            System.out.println(fruits[i].toString());
        }
        //Task4_2
        for (int i = 0; i < fabrics.length; i++){
            fabrics[i] = getRandomFabric(random.nextInt(4)+1);
        }
        //Task4_2
        for (int i = 0; i < fruitsFactory.length; i++){
            fruitsFactory[i] = getRandomFabric(fabricNumber).makeFruit();
            if (i%2 != 0)
                fabricNumber++;
            if (fabricNumber == 5)
                fabricNumber = 1;
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

    //Task4_2
    static AbstractFabric getRandomFabric(int fabricNumber){
        switch (fabricNumber){
            case 1:
                return new ThinOrangeFactory();
            case 2:
                return new RedApplesFactory();
            case 3:
                return new GreenApplesFactory();
            case 4:
                return new LongPinepplesFactory();
            default:
                return null;
        }
    }
}
