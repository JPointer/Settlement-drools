package com.pointer.model.buildings;

/*Kamieniołom*/
public class Quarry extends Building {

    private Warehouse warehouse;
    private int day;
    private int workers;

    public Quarry(Warehouse warehouse, int day, int workers) {
        this.warehouse = warehouse;
        this.day = day;
        this.workers = workers;
    }

    public void addStone(int n) {
        while(n-- != 0)
            warehouse.addStone();
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
