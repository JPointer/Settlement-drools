package com.pointer.main;

public class Gold {

    private int money = 0;
    private double taxRate = 0.75;

    public void addMoney(int m) {
        if(m>=0) {
            money += m;
        } else {
            if(money -m > 0)
                money -= m;
            else money = 0;
        }
        System.out.println("MONEY: " + money);
    }
    public int getMoney() {
        return money;
    }

    public double getTaxRate() {
        return taxRate;
    }


}
