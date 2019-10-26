package ocp;

public class LaunchDiscount implements Discount {
    public Double apply(Double price) {
        return price * 0.5;
    }
}
