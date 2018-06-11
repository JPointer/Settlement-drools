package com.pointer.model.buildings;

/*tartak*/
public class Sawmill extends Building {

    private Warehouse warehouse;
    private int day;
    private int workers;

    public Sawmill(Warehouse warehouse, int day, int workers) {
        this.warehouse = warehouse;
        this.day = day;
        this.workers = workers;
    }

    public void addWood(int n) {
        while(n-- != 0)
            warehouse.addWood();
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
