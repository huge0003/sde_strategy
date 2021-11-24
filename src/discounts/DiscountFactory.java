package discounts;

import com.hz.SalesAction;

public class DiscountFactory {

    public static Discount getDefaultDiscount(){
        return new NullDiscount();
    }

    public static Discount getDiscountSale(SalesAction action){
        if(action == SalesAction.ChristmasEve){
            return new ChristmasEve();
        }
        if (action == SalesAction.NoAction){
            return new NoSalesAction();
        }
        if (action == SalesAction.BlackFriday){
            return new BlackFriday();
        }

        throw new IllegalArgumentException(action + "not supported");
    }
}
