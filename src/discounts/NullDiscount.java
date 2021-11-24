package discounts;

import com.hz.Customer;
import products.Product;

public class NullDiscount implements Discount{
    @Override
    public double getDiscount(int index, int count, Customer customer) {
        return 0;
    }
}
