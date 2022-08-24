package com.company;

public class Main {

    public static void main(String[] args) {

        CafeWafflelicious waffle1 = new Belgian();
        System.out.println(waffle1.getDescription() + " $ " + waffle1.cost());

        waffle1 = new ChocolateTopping(waffle1,ChocolateSpecial.MILKY);
        System.out.println(waffle1.getDescription() + "  $ " + waffle1.cost());

        waffle1 = new FruitTopping(waffle1,FruitSpecial.STRAWBERRY);
        System.out.println(waffle1.getDescription() + "  $ " + waffle1.cost());

        waffle1 = new FruitTopping(waffle1,FruitSpecial.BANANA);
        System.out.println(waffle1.getDescription() + "  $ " + waffle1.cost());

        waffle1 = new FruitTopping(waffle1,FruitSpecial.KIWI);
        System.out.println(waffle1.getDescription() + "  $ " + waffle1.cost());

        waffle1 = new SauceTopping(waffle1,SauceSpecial.CHOCOLATE);
        System.out.println(waffle1.getDescription() + "  $ " + waffle1.cost());

        System.out.println("\n");



        CafeWafflelicious waffle2 = new FreeGluten();
        System.out.println(waffle2.getDescription() + " $ " + waffle2.cost());

        waffle2 = new ChocolateTopping(waffle2,ChocolateSpecial.DARK);
        System.out.println(waffle2.getDescription() + "  $ " + waffle2.cost());

        waffle2 = new ChocolateTopping(waffle2,ChocolateSpecial.MILKY);
        System.out.println(waffle2.getDescription() + "  $ " + waffle2.cost());

        waffle2 = new FruitTopping(waffle2,FruitSpecial.STRAWBERRY);
        System.out.println(waffle2.getDescription() + "  $ " + waffle2.cost());

        waffle2 = new FruitTopping(waffle2,FruitSpecial.PINEAPPLE);
        System.out.println(waffle2.getDescription() + "  $ " + waffle2.cost());

        waffle2 = new FruitTopping(waffle2,FruitSpecial.KIWI);
        System.out.println(waffle2.getDescription() + "  $ " + waffle2.cost());

        waffle2 = new NutTopping(waffle2,NutSpecial.COCONUT);
        System.out.println(waffle2.getDescription() + "  $ " + waffle2.cost());

        waffle2 = new NutTopping(waffle2,NutSpecial.WALNUT);
        System.out.println(waffle2.getDescription() + "  $ " + waffle2.cost());









    }
}
