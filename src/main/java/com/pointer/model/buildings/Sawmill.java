package com.pointer.model.buildings;

/*tartak*/
public class Sawmill extends Building {

    private Warehouse warehouse;
    private int workers;

    public Sawmill(Warehouse warehouse, int day, int workers) {
        super(day);
        this.warehouse = warehouse;
        this.workers = workers;
    }

    public void addWood(int n) {
        while(n-- != 0)
            warehouse.addWood();
    }

    public int howManyWorkers() {
        return workers;
    }

}
