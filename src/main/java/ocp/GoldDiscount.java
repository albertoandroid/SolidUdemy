package ocp;

public class GoldDiscount implements Discount{

    public Double apply(Double price){
        return price * 0.2;
    }
}
