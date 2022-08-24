package com.company;

public class Wheat extends CafeWafflelicious{
    public Wheat(){
        description = "Wheat waffle dough ";
    }
    @Override
    public double cost() {
        return 15.0;
    }
}
