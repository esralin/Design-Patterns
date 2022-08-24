package com.company;

public class NutTopping extends ToppingDecorator{

    CafeWafflelicious cafeWafflelicious;
    NutSpecial nutSpecial;

    public NutTopping(CafeWafflelicious cafeWafflelicious, NutSpecial nutSpecial){
        this.cafeWafflelicious = cafeWafflelicious;
        this.nutSpecial = nutSpecial;
    }

    public String printSpecial(){
        if(nutSpecial == NutSpecial.ALMOND)
            return "Almond";
        if(nutSpecial == NutSpecial.COCONUT)
            return "Coconut";
        if(nutSpecial == NutSpecial.HAZELNUT)
            return "Hazelnut";
        if(nutSpecial == NutSpecial.WALNUT)
            return "Walnut";
        if(nutSpecial == NutSpecial.PISTACHIO)
            return "Pistachio";
        return "Wrong Order";
    }
    @Override
    public double cost() {
        return 1.0 + cafeWafflelicious.cost();
    }

    @Override
    public String getDescription() {
        return cafeWafflelicious.getDescription() + ", " + printSpecial();
    }
}
