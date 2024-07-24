package StrategiesPatternExample;

public class ShoppingCart{
    private DiscountStrategy discountStrategy;
    public void setDiscountStrategy(DiscountStrategy discountStrategy)
    {
        this.discountStrategy=discountStrategy;
    }

    public double checkOut(double price)
    {
        return discountStrategy.applyDiscount(price);
    }

}