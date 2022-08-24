package com.company;

public class ChocolateTopping extends ToppingDecorator{
    CafeWafflelicious cafeWafflelicious;
    ChocolateSpecial chocolateSpecial;

    public ChocolateTopping(CafeWafflelicious cafeWafflelicious, ChocolateSpecial chocolateSpecial){
        this.cafeWafflelicious = cafeWafflelicious;
        this.chocolateSpecial = chocolateSpecial;
    }

    public String printSpecial(){
        if(chocolateSpecial == ChocolateSpecial.CARAMEL)
            return "Caramel";
        if(chocolateSpecial == ChocolateSpecial.DARK)
            return "Dark Chocolate";
        if(chocolateSpecial == ChocolateSpecial.MILKY)
            return "Milky Chocolate";
        if(chocolateSpecial == ChocolateSpecial.NUTELLA)
            return "Nutella";
        if(chocolateSpecial == ChocolateSpecial.WHITE)
            return "White Chocolate";
        return "Wrong Order";
    }
    @Override
    public double cost() {
        return 2.0 + cafeWafflelicious.cost();
    }

    @Override
    public String getDescription() {
        return cafeWafflelicious.getDescription() + ", " + printSpecial() ;
    }
}
