package com.pointer.model.buildings;

import com.pointer.model.avatars.Worker;

import java.util.ArrayList;

public class House  {

    private int capacity;
    ArrayList<Worker> workers = new ArrayList<>();

    public House(int capacity) {
        workers.add(new Worker());
    }
}
