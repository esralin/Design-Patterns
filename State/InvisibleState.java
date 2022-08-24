package com.company;

public class InvisibleState implements State{
    HeroContext hero;

    public InvisibleState(HeroContext hero) {
        this.hero = hero;
    }

    @Override
    public void attacked(int damage) {
        System.out.println("Hero is invisible, and cannot be attacked.");
    }

    @Override
    public void attack() {
        System.out.println("Hero is attacking others.");
    }

    @Override
    public void silenced() {
        System.out.println("Hero is invisible, and cannot be silenced.");
    }

    @Override
    public void disappear() {
        System.out.println("Hero is already invisible, and cannot disappear.");
    }

    @Override
    public void revived() {
        System.out.println("Hero is already alive, and cannot be revived.");
    }

    @Override
    public void recovered() {
        System.out.println("Hero is already recovered, and cannot be recovered.");
    }

    @Override
    public void visible() {
        System.out.println("Hero appears.");
        hero.setState(hero.getAliveState());
    }

    @Override
    public String stateName() {
        return "invisible";
    }
}
