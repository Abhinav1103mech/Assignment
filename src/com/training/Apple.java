package com.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Apple implements Fruits{


    @Override
    public String getColor() {
        List<String> colors = new ArrayList<>(Arrays.asList("green","red"));
        Random random = new Random();
        int randNum = random.nextInt(colors.size());
        return colors.get(randNum);
    }

    @Override
    public String getShape() {
        return "Round";
    }
}
