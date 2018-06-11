package com.pointer.main;

import com.pointer.model.Happyness;
import com.pointer.model.buildings.Granary;

public class Settlement {

    private int numberOfWorkers;
    private Happyness happyness;
    private Granary granary;
    private Gold gold;

    public void setNumberOfWorkers(int numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    public void setHappyness(Happyness happyness) {
        this.happyness = happyness;
    }

    public void setGranary(Granary granary) {
        this.granary = granary;
    }

    public void setGold(Gold gold) {
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
