package com.pointer.model.buildings;

/*sad*/
public class Orchard /*extends Building */{

    private Granary granary;
    private int day;
    private int workers;

    public Orchard(Granary granary, int day, int workers) {
        this.granary = granary;
        this.day = day;
        this.workers = workers;
    }

    public void addApple(int n) {
        while(n-- != 0)
            granary.addApple();
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

