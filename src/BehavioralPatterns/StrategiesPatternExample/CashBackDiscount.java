package StrategiesPatternExample;

public class CashBackDiscount implements DiscountStrategy{
private double cashBackAmount;

public CashBackDiscount(double cashBackAmount)
{
    this.cashBackAmount=cashBackAmount;
}
    @Override
    public double applyDiscount(double price) {
       return 
       price-cashBackAmount;
        
    }

}