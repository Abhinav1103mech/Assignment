package com.training;
import java.util.*;
import java.util.stream.Collectors;

public class Fruit_Bowls {
    List<Fruits> fruitsList;

    public Fruit_Bowls(){
        fruitsList = new ArrayList<Fruits>();
    }

    public void addFruitsToBowl(Fruits fruits){
        fruitsList.add(fruits);
    }

    public int getCountOfFruits(){
        return fruitsList.size();
    }

    public List<Fruits> getApples(){
        return fruitsList.stream().filter(fruits -> fruits instanceof Apple).collect(Collectors.toList());
    }

    public List<Fruits> getBanana(){
        return fruitsList.stream().filter(fruits -> fruits instanceof Banana).collect(Collectors.toList());
    }

    public List<Fruits> getOrange(){
        return fruitsList.stream().filter(fruits -> fruits instanceof Orange).collect(Collectors.toList());
    }


}
