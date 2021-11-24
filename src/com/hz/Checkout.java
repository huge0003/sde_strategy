package com.hz;

import discounts.Discount;
import discounts.DiscountFactory;

public class Checkout {

    private SalesAction salesAction;
    private Discount discount;

    public void setDiscount(Discount discount){
        this.discount = discount;
    }

    public Checkout() {
        this.discount = DiscountFactory.getDefaultDiscount();
    }

    public void nextInLine(Customer customer) {

//        // init checkout
//        DiscountCalculator discountCalculator = new DiscountCalculator(customer);
//        if(salesAction == SalesAction.ChristmasEve) {
//            discountCalculator.setChristmasEve(true);
//        }

        // Welcome customer
        String welcome = String.format("Hello %s, would you pass me your shopping cart?",
                customer.getName());
        Console.write(welcome);

        // perform checkout
        ShoppingCart cart = customer.getCart();

        double amountToPay = cart.getTotalPrice(discount);
        String payinfo = String.format("Let's see, that will be.. %.02f. Cash or card?", amountToPay);
        Console.write(payinfo);
    }
}
