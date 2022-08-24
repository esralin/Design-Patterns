package SecondOne.Model;

import SecondOne.Shopping;

import java.util.List;

public class AmericaShopping implements Shopping {


    double dutyTax=0.01;
    double baseFee=15;
    double addedFee=5;
    double addedFeeXL=10;
    double additionalTax=0.0075;
    double totalFee = 0;

    @Override
    public double calculatePrice(List<Product> products) {
        for(int i=0;i<products.size();i++) {
            if(products.get(i).getSize() == Size.XL){
                totalFee += products.get(i).getPrice() + baseFee + addedFeeXL + (products.get(i).getPrice() * dutyTax) + (products.get(i).getPrice() * additionalTax);
            }
            else {
                totalFee += products.get(i).getPrice() + baseFee + addedFee + (products.get(i).getPrice() * dutyTax) + (products.get(i).getPrice() * additionalTax);
            }
        }
        return totalFee;
    }

    @Override
    public Currency getCurrency() {
        return Currency.USD;
    }
}
