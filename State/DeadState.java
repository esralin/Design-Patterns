package com.company;

public class DeadState implements State{
    HeroContext hero;
    int hp=0;

    public DeadState(HeroContext hero) {
        this.hero = hero;
        hero.setHp(this.hp);
    }

    @Override
    public void attacked(int damage) {
        System.out.println("Hero is dead, and cannot be attacked.");
    }

    @Override
    public void attack() {
        System.out.println("Hero is dead, and cannot attack others.");
    }

    @Override
    public void silenced() {
        System.out.println("Hero is dead, and cannot be silenced.");
    }

    @Override
    public void disappear() {
        System.out.println("Hero is dead, and cannot disappear.");
    }

    @Override
    public void revived() {
        System.out.println("Hero is being revived.");
        hero.setState(hero.getAliveState());
        hero.setHp(10);
    }

    @Override
    public void recovered() {
        System.out.println("Hero is dead, and cannot be recovered.");
    }

    @Override
    public void visible() {
        System.out.println("Hero is dead, and cannot appear.");
    }

    @Override
    public String stateName() {
        return "dead";
    }
}
