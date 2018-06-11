package com.pointer.model.buildings;

public class Cowshed extends Building {

    private Granary granary;
    private int day;
    private int workers;

    public Cowshed(Granary granary, int day, int workers) {
        super(day);
        this.granary = granary;
        this.workers = workers;
    }

    public void addCheese(int n) {
        while(n-- != 0)
            granary.addCheese();
    }

    public int howManyWorkers() {
        return workers;
    }
}
