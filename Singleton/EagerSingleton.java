package com.company;

public class EagerSingleton {
    private static final int addCoin = 10;
    private int coin;
    private static EagerSingleton uniqueInstance = new EagerSingleton();


    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return uniqueInstance;
    }

    public void getCoinCount(int coinNo) {
        System.out.println("coin"+coinNo+".getCoinCount() = "+coin);

    }

    public void addMoreCoin() {
        coin += addCoin;
    }

    public void reduceCoin() {
        coin--;
    }
}
