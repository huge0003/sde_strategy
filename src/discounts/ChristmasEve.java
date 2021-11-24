package discounts;

import com.hz.Customer;
import products.Product;

public class ChristmasEve implements Discount{

    @Override
    public double getDiscount(int index, int count, Customer customer) {
        double discount = 0.0;

        boolean isFirstProduct = index == 0;

        if (isFirstProduct) {
            discount = .20;
        } else {
            discount = .125;
        }

        return 1 - discount;
    }
}
