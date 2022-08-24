package com.company;

public class SauceTopping extends ToppingDecorator{
    CafeWafflelicious cafeWafflelicious;
    SauceSpecial sauceSpecial;

    public SauceTopping(CafeWafflelicious cafeWafflelicious, SauceSpecial sauceSpecial){
        this.cafeWafflelicious = cafeWafflelicious;
        this.sauceSpecial = sauceSpecial;
    }

    public String printSpecial(){
        if(sauceSpecial == SauceSpecial.CARAMEL)
            return "Caramel Souce";
        if(sauceSpecial == SauceSpecial.CHOCOLATE)
            return "Chocolate Souce";
        if(sauceSpecial == SauceSpecial.RASPBERRY)
            return "Raspberry Souce";
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
