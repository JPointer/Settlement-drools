package com.pointer.main;

import com.pointer.model.Happyness;
import com.pointer.model.buildings.Granary;

public class Settlement {

    private int numberOfWorkers;
    private Happyness happyness;
    private Granary granary;
    private Gold gold;

    public Settlement(int numberOfWorkers, Granary granary, Happyness happyness, Gold gold) {
        this.numberOfWorkers = numberOfWorkers;
        this.happyness = happyness;
        this.granary = granary;
        this.gold = gold;
    }

    public int getNumberOfWorkers() {
        return numberOfWorkers;
    }

    public Granary getGranary() {
        return granary;
    }

    public Happyness getHappyness() {
        return happyness;
    }

    public Gold getGold() {
        return gold;
    }
}
