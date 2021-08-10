package com.training;

public class Main {

    public static void main(String[] args) {

        Fruit_Bowls bowl = new Fruit_Bowls();
        bowl.addFruitsToBowl(new Apple());
        bowl.addFruitsToBowl(new Orange());
        bowl.addFruitsToBowl(new Banana());
        bowl.addFruitsToBowl(new Banana());
        bowl.addFruitsToBowl(new Orange());
        bowl.addFruitsToBowl(new Orange());
        bowl.addFruitsToBowl(new Apple());
        bowl.addFruitsToBowl(new Apple());
        bowl.addFruitsToBowl(new Apple());

        System.out.println("The total no. of fruits in bowl are: "+ bowl.getCountOfFruits());

        System.out.println("total count of Apples are: "+bowl.getApples().size());
        Apple apple = new Apple();
        System.out.println("Shape of apple is: "+apple.getShape());
        System.out.println("Color of apple is: "+apple.getColor());
        System.out.println("Color of apple is: "+apple.getColor());

        System.out.println("total count of bananas are: "+ bowl.getBanana().size());
        Banana banana = new Banana();
        System.out.println("Shape of banana is: "+banana.getShape());
        System.out.println("Color of banana is: "+banana.getColor());
        System.out.println("Color of banana is: "+banana.getColor());

        System.out.println("total count of Oranges are: " +bowl.getOrange().size());
        Orange orange = new Orange();
        System.out.println("Shape of oranges are: "+orange.getShape());
        System.out.println("Color of oranges are: "+orange.getColor());
        System.out.println("Color of oranges are: "+orange.getColor());


    }
}
