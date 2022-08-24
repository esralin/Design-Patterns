package com.company;

public class FruitTopping extends ToppingDecorator{
    CafeWafflelicious cafeWafflelicious;
    FruitSpecial fruitSpecial;

    public FruitTopping(CafeWafflelicious cafeWafflelicious,FruitSpecial fruitSpecial){
        this.cafeWafflelicious = cafeWafflelicious;
        this.fruitSpecial = fruitSpecial;

    }

    public String printSpecial(){
        if(fruitSpecial == FruitSpecial.BANANA)
            return "Banana";
        if(fruitSpecial == FruitSpecial.KIWI)
            return "Kiwi";
        if(fruitSpecial == FruitSpecial.PINEAPPLE)
            return "Pineapple";
        if(fruitSpecial == FruitSpecial.STRAWBERRY)
            return "Strawberry";
        return "Wrong Order";
    }
    @Override
    public double cost() {
        return 0.5 + cafeWafflelicious.cost();
    }

    @Override
    public String getDescription() {
        return cafeWafflelicious.getDescription() + ", " + printSpecial();
    }
}
