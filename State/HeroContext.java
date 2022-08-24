package com.company;

public class HeroContext {
    State aliveState;
    State deadState;
    State invisibleState;
    State silencedState;

    State state;
    int hp=0;

    public HeroContext(int hp){
        aliveState = new AliveState(this);
        deadState = new DeadState(this);
        invisibleState = new InvisibleState(this);
        silencedState = new SilencedState(this);

        this.hp = hp;
        if(hp > 0){
            state = aliveState;
        }
        else{
            state = deadState;
        }
    }

    public void setState(State state){
        this.state = state;
    }

    public void getInformation(){
        System.out.println("\n");
        System.out.println("Hero Context");
        System.out.println("============");
        System.out.println("Hero HP "+ getHp());
        System.out.println("Hero is "+ state.stateName()+ "\n");
    }


    public void attacked(int damage){
        state.attacked(damage);
    }

    public void attack(){
        state.attack();
    }

    public void silenced(){
        state.silenced();
    }

    public void disappear(){
        state.disappear();
    }

    public void revived(){
        state.revived();
    }

    public void recovered(){
        state.recovered();
    }

    public void visible(){
        state.visible();
    }

    public State getAliveState() {
        return aliveState;
    }

    public State getDeadState() {
        return deadState;
    }

    public State getInvisibleState() {
        return invisibleState;
    }

    public State getSilencedState() {
        return silencedState;
    }

    public State getState() {
        return state;
    }

    public void setHp(int hp) {
        if(hp < 0){
            hp = 0;
        }
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }


}
