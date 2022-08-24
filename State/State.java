package com.company;

public interface State {
    void attacked(int damage);
    void attack();
    void silenced();
    void disappear();
    void revived();
    void recovered();
    void visible();
    String stateName();
}
