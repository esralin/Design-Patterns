package com.company;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton uniqueInstance;
    private static final int addCoin = 10;
    private int coin;

    private ThreadSafeSingleton(){}

    //synchronized
    synchronized public static ThreadSafeSingleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new ThreadSafeSingleton();
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
