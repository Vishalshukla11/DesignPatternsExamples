package StrategiesPatternExample;

public class CouponDiscount implements DiscountStrategy{

    private double DiscountAmount;
    public CouponDiscount(double DiscountAmount)
    {
        this.DiscountAmount=DiscountAmount;
    }
    @Override
    public double applyDiscount(double price) {
        return price-(price* DiscountAmount/100);
        
    }

}