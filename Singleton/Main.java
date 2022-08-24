package com.company;

public class Main {

    public static void main(String[] args) {

            EagerSingleton.getInstance().addMoreCoin(); //EAGER SINGLETON

            EagerSingleton.getInstance().getCoinCount(1);
            EagerSingleton.getInstance().getCoinCount(2);

            System.out.println("\n");
            EagerSingleton.getInstance().reduceCoin(); //Reducing
            EagerSingleton.getInstance().getCoinCount(1);
            EagerSingleton.getInstance().getCoinCount(2);

            System.out.println("\n");
            System.out.println("coin1 = "+EagerSingleton.getInstance()); //Adresses
            System.out.println("coin2 = "+EagerSingleton.getInstance());
            System.out.println("\n");
            System.out.println("\n");




            LazySingleton.getInstance().addMoreCoin(); //LAZY SINGLETON

            LazySingleton.getInstance().getCoinCount(1);
            LazySingleton.getInstance().getCoinCount(2);

            System.out.println("\n");
            LazySingleton.getInstance().reduceCoin();
            LazySingleton.getInstance().getCoinCount(1);
            LazySingleton.getInstance().getCoinCount(2);


            System.out.println("\n");
            System.out.println("coin1 = "+LazySingleton.getInstance());
            System.out.println("coin2 = "+LazySingleton.getInstance());
            System.out.println("\n");
            System.out.println("\n");


            ThreadSafeSingleton.getInstance().addMoreCoin(); //THREAD SINGLETON

            ThreadSafeSingleton.getInstance().getCoinCount(1);
            ThreadSafeSingleton.getInstance().getCoinCount(2);

            System.out.println("\n");
            ThreadSafeSingleton.getInstance().reduceCoin();
            ThreadSafeSingleton.getInstance().getCoinCount(1);
            ThreadSafeSingleton.getInstance().getCoinCount(2);


            System.out.println("\n");
            System.out.println("coin1 = "+ThreadSafeSingleton.getInstance());
            System.out.println("coin2 = "+ThreadSafeSingleton.getInstance());







    }
}
