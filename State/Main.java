package com.company;

public class Main {

    public static void main(String[] args) {
	HeroContext hero = new HeroContext(10);

        hero.getInformation();

        hero.attacked(5);

        hero.getInformation();

        hero.attack();
        hero.getInformation();

        hero.visible();
        hero.recovered();
        hero.revived();

        hero.disappear();

        hero.getInformation();
        hero.disappear();
        hero.attacked(5);
        hero.silenced();
        hero.recovered();
        hero.revived();
        hero.attack();

        hero.getInformation();
        hero.visible();

        hero.getInformation();
        hero.attacked(10);

        hero.getInformation();
        hero.visible();
        hero.revived();

        hero.getInformation();
        hero.silenced();

        hero.getInformation();



    }
}
