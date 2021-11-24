package discounts;

import com.hz.Customer;
import products.Product;

public class NoSalesAction implements Discount{
    @Override
    public double getDiscount(int index, int count, Customer customer) {
        double discount = 0.0;

        boolean isFirstProduct = index == 0;

        if(customer.isRegular()) {
            discount = .15;
        } else discount = 0;

        return 1 - discount;
    }
}
