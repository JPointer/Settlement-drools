package com.pointer.model.buildings;

import com.pointer.model.food.Apple;
import com.pointer.model.food.Cheese;
import com.pointer.model.food.Meet;

import java.util.ArrayList;

/*Spichlerz*/
public class Granary extends Building {

    private ArrayList<Apple> apples = new ArrayList<>();
    private ArrayList<Cheese> cheese =  new ArrayList<>();
    private ArrayList<Meet> meet = new ArrayList<>();

    private double portionSize = 1;

    public Granary(double portionSize) {
        this.portionSize = portionSize;
    }

    public double getPortionSize() {
        return portionSize;
    }

    public void addApple() {
        apples.add(new Apple());
        System.out.println("APPLE" + apples.size());
    }

    public void addCheese() {
        cheese.add(new Cheese());
        System.out.println("CHEESE" + apples.size());
    }

    public void addMeet() {
        meet.add(new Meet());
        System.out.println("MEET" + meet.size());
    }

}
