package com.company;

public class AliveState implements State{
    HeroContext hero;
    int hp=10;


    public AliveState(HeroContext hero) {
        this.hero = hero;
        hero.setHp(this.hp);
    }



    @Override
    public void attacked(int damage) {
       System.out.println("Hero is being attacked with damage: "+damage);
       hp = hp - damage;
       hero.setHp(hp);
       if(hp <= 0){
           hero.setState(hero.getDeadState());
       }
    }

    @Override
    public void attack() {
        System.out.println("Hero is attacking others.");
    }

    @Override
    public void silenced() {
     System.out.println("Hero is being silenced.");
     hero.setState(hero.getSilencedState());
    }

    @Override
    public void disappear() {
        System.out.println("Hero disappears.");
        hero.setState(hero.getInvisibleState());
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
        System.out.println("Hero is already visible, and cannot be appear.");
    }

    @Override
    public String stateName() {
        return "alive";
    }

}
