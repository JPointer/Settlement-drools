package com.pointer.model.buildings;

public class Ironworks extends Building{
    private Warehouse warehouse;
    private int day;
    private int workers;

    public Ironworks(Warehouse warehouse, int day, int workers) {
        this.warehouse = warehouse;
        this.day = day;
        this.workers = workers;
    }

    public void addIron(int n) {
        while(n-- != 0)
            warehouse.addIron();
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
