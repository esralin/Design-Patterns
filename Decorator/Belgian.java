package com.company;

public class Belgian extends CafeWafflelicious{

    public Belgian(){
        description = "Belgian waffle dough ";
    }
    @Override
    public double cost() {
        return 16.0;
    }
}
