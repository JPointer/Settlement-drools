package com.pointer.model.buildings;

public class Butchery {

    private Granary granary;
    private int day;
    private int workers;

    public Butchery(Granary granary, int day, int workers) {
        this.granary = granary;
        this.day = day;
        this.workers = workers;
    }

    public void addMeet(int n) {
        while(n-- != 0)
            granary.addMeet();
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
