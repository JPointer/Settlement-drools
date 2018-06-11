package com.pointer.model.buildings;

public class Butchery extends Building{

    private Granary granary;
    private int workers;

    public Butchery(Granary granary, int day, int workers) {
        super(day);
        this.granary = granary;
        this.workers = workers;
    }

    public void addMeet(int n) {
        while(n-- != 0)
            granary.addMeet();
    }

    public int howManyWorkers() {
        return workers;
    }
}
