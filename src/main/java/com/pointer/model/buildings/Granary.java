package com.pointer.model.buildings;

/*Spichlerz*/
public class Granary {

    private double apples = 0.0;
    private double cheese = 0.0;
    private double meet =0.0;

    private double portionSize = 1;

    public Granary(double portionSize) {
        this.portionSize = portionSize;
    }

    public double getPortionSize() {
        return portionSize;
    }

    public void addApple() {
        apples += 1;
        System.out.println("APPLE" + apples);
    }

    public void addCheese() {
        cheese += 1;
        System.out.println("CHEESE" + cheese);
    }

    public void addMeet() {
        meet += 1;
        System.out.println("MEET" + meet);
    }

    public void eatPortion(double a, double ch, double m) {
            apples -= a;
            cheese -= ch;
            meet -= m;
    }

    public double getApples() {
        return apples;
    }

    public double getCheese() {
        return cheese;
    }

    public double getMeet() {
        return meet;
    }
}
