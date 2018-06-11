package com.pointer.model;

public class Happyness {

    private int happyLevel;

    public Happyness(int happyLevel) {
        this.happyLevel = happyLevel;
    }

    public void addHappy(int i) {
        if(i >= 0) {
            if(happyLevel + i < 100)
                happyLevel += i;
            else happyLevel = 100;
        } else {
            if(happyLevel + i > 0)
                happyLevel += i;
            else happyLevel = 0;
        }
    }
    public int getHappyLevel() {
        return happyLevel;
    }
}
