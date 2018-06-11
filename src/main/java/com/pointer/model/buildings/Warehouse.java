package com.pointer.model.buildings;

import com.pointer.model.stock.Iron;
import com.pointer.model.stock.Stone;
import com.pointer.model.stock.Wood;

import java.util.ArrayList;

public class Warehouse {

    private int wood =  0;
    private int iron =  0;
    private int stone = 0;

    public void addWood() {
        wood += 1;
        System.out.println("WOOD" + wood);
    }

    public void addStone() {
        stone += 1;
        System.out.println("STONE" + stone);
    }

    public void addIron() {
        iron += 1;
        System.out.println("IRON" + iron);
    }
}
