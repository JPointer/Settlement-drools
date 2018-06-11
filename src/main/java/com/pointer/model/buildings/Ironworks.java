package com.pointer.model.buildings;

public class Ironworks extends Building{
    private Warehouse warehouse;
    private int workers;

    public Ironworks(Warehouse warehouse, int day, int workers) {
        super(day);
        this.warehouse = warehouse;
        this.workers = workers;
    }

    public void addIron(int n) {
        while(n-- != 0)
            warehouse.addIron();
    }



    public int howManyWorkers() {
        return workers;
    }
}
