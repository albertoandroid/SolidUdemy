package ocp;

public class BlackFridayDiscount implements Discount{

    public Double apply(Double price){
        return price * 0.4;
    }
}
