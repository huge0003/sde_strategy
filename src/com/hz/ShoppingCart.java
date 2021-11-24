package com.hz;
import discounts.Discount;
import products.Product;

import java.util.ArrayList;

public class ShoppingCart extends ArrayList<Product> {

    private Customer customer;

    public ShoppingCart (Customer customer) {
        this.customer = customer;
    }

    public double getTotalPrice(Discount discount) {

        double totalPrice = 0.0;

        for(Product product : this) {

            int index = this.indexOf(product);

            int count = this.size();

            double multiplier = 1 - discount.getDiscount(index, count, customer);
            double price = product.getPrice() * multiplier;

            totalPrice += price;
        }

        return totalPrice;
    }
}