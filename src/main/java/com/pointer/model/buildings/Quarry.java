package com.pointer.model.buildings;

/*Kamieniołom*/
public class Quarry extends Building {

    private Warehouse warehouse;
    private int day;
    private int workers;

    public Quarry(Warehouse warehouse, int day, int workers) {
        super(day);
        this.warehouse = warehouse;
        this.workers = workers;
    }

    public void addStone(int n) {
        while(n-- != 0)
            warehouse.addStone();
    }

    public int howManyWorkers() {
        return workers;
    }
}
