package SecondOne.Model;

import SecondOne.Shopping;

import java.util.List;

public class EuropeShopping implements Shopping {
    @Override
    public double calculatePrice(List<Product> products) {
        double dutyTax=0.015;
        double baseFee=11;
        double addedFeeXL=10;
        double totalFee = 0;

        for(int i=0;i < products.size();i++) {
            if(products.get(i).getSize() == Size.XL){
                totalFee += products.get(i).getPrice() + baseFee + addedFeeXL + (products.get(i).getPrice() * dutyTax);
            }
            else {
                totalFee += products.get(i).getPrice() + baseFee + (products.get(i).getPrice() * dutyTax);
            }
        }
        return totalFee;
    }

    @Override
    public Currency getCurrency() {
        return Currency.EUR;
    }
}
