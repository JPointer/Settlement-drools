package com.pointer.model.buildings;

import com.pointer.model.stock.Iron;
import com.pointer.model.stock.Stone;
import com.pointer.model.stock.Wood;

import java.util.ArrayList;

public class Warehouse extends Building {

    private ArrayList<Wood> wood = new ArrayList<>();
    private ArrayList<Iron> iron =  new ArrayList<>();
    private ArrayList<Stone> stone = new ArrayList<>();

    public void addWood() {
        wood.add(new Wood());
        System.out.println("WOOD" + wood.size());
    }

    public void addStone() {
        stone.add(new Stone());
        System.out.println("STONE" + stone.size());
    }

    public void addIron() {
        iron.add(new Iron());
        System.out.println("IRON" + iron.size());
    }
}
