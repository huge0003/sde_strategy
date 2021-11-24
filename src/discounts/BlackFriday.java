package discounts;

import com.hz.Customer;

public class BlackFriday implements Discount{
    @Override
    public double getDiscount(int index, int count, Customer customer) {

        double discount = 0.0;

        if(discount <= 0.8){
            discount = count;
        } else discount = 0.8;

        return discount;
    }
}
