package com.company;

public class SilencedState implements State{
    HeroContext hero;
    int hp = 10;

    public SilencedState(HeroContext hero) {
        this.hero = hero;
        hero.setHp(this.hp);
    }

    @Override
    public void attacked(int damage) {
        System.out.println("Hero is being attacked with damage: "+damage);
        hp = hp - damage;
        hero.setHp(hp);
        if(hp == 0){
            hero.setState(hero.getDeadState());
        }
    }

    @Override
    public void attack() {
        System.out.println("Hero is silenced,and cannot attack others.");

    }

    @Override
    public void silenced() {
        System.out.println("Hero is already silenced, and cannot be silenced again.");
    }

    @Override
    public void disappear() {
        System.out.println("Hero disappears.");
        hero.setState(hero.getInvisibleState());
    }

    @Override
    public void revived() {
        System.out.println("Hero is already alive but silenced, and cannot be revived.");
    }

    @Override
    public void recovered() {
        System.out.println("Hero is being recovered.");
        hero.setState(hero.getAliveState());
    }

    @Override
    public void visible() {
        System.out.println("Hero is already visible, and cannot appear.");
    }

    @Override
    public String stateName() {
        return "silenced";
    }
}
