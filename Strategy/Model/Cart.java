package SecondOne.Model;

import SecondOne.Shopping;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    List<Product> products;
    Shopping shopping;

    public Cart(Shopping shopping) {
       this.shopping = shopping;
       products = new ArrayList<Product>();
    }


    public void addProduct(Product product){
        this.products.add(product);
    }

    public double getTotalPrice() {
        return shopping.calculatePrice(products);
    }


}
