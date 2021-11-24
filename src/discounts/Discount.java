package discounts;

import com.hz.Customer;
import products.Product;

public interface Discount {
    double getDiscount(int index, int count, Customer customer);
}
