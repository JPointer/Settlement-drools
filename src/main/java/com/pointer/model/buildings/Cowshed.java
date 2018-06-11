package com.pointer.model.buildings;

public class Cowshed {

    private Granary granary;
    private int day;
    private int workers;

    public Cowshed(Granary granary, int day, int workers) {
        this.granary = granary;
        this.day = day;
        this.workers = workers;
    }

    public void addCheese(int n) {
        while(n-- != 0)
            granary.addCheese();
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int howManyWorkers() {
        return workers;
    }
}
