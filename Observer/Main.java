package com.company;

public class Main {

    public static void main(String[] args) {
	    ConcreteCelebrity concreteCelebrity1 = new ConcreteCelebrity("Karsu Donmez");
        ConcreteCelebrity concreteCelebrity2 = new ConcreteCelebrity("Ferit Odman");

        ConcreteFollower concreteFollower1 = new ConcreteFollower(concreteCelebrity1,"Deniz");
        ConcreteFollower concreteFollower2 = new ConcreteFollower(concreteCelebrity1,"Robert");
        ConcreteFollower concreteFollower3 = new ConcreteFollower(concreteCelebrity1,"Steven");

        System.out.println("\n");

        ConcreteFollower concreteFollower4 = new ConcreteFollower(concreteCelebrity2,"Jeff");
        ConcreteFollower concreteFollower5 = new ConcreteFollower(concreteCelebrity2,"Sandra");
        ConcreteFollower concreteFollower6 = new ConcreteFollower(concreteCelebrity2,"Olivia");

        System.out.println("\n");

        concreteCelebrity1.setTweets(":) Which artists will be guest in my room?");
        System.out.println("\n");

        concreteCelebrity2.setTweets("It rarely happens to me, but I was hittin' it hard tonight ! ");
        System.out.println("\n");

        concreteCelebrity2.removeFollower(concreteFollower4);

        System.out.println("\n");
        concreteCelebrity2.setTweets(" WHAAA I am the new FOOD COLUMNIST of @andcgram Magazine! ");







    }
}
