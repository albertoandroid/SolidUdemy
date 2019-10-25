package ocp;

public class DiscountManager {

    Double apply(Double price, Discount discount){
        return discount.apply(price);
    }

    Double apply(Double price, GoldDiscount discount){
        return discount.apply(price);
    }

    Double apply(Double price, BlackFridayDiscount discount){
        return discount.apply(price);
    }
}
