package com.company;

public class LazySingleton {
public static LazySingleton uniqueInstance;
private static final int addCoin = 10;
private int coin;


private LazySingleton(){}

    public static LazySingleton getInstance(){
    if(uniqueInstance == null){
        uniqueInstance = new LazySingleton();
    }
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
