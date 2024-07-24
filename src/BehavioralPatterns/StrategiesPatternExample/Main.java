package StrategiesPatternExample;

public class Main{
    public static void main(String args[])
    {
        ShoppingCart cart=new ShoppingCart();

        //apply discount cashback
        cart.setDiscountStrategy(new CashBackDiscount(50));
        System.out.println("Final Price with cashBack Discount: " + cart.checkOut(200)); // outputs: 150.0
   
   
        //apply flat discount
        cart.setDiscountStrategy(new FlatDiscount(30));
        System.out.println("Final price with Discount: " + cart.checkOut(200)); //170.0rs

        //apply coupan discount 
        cart.setDiscountStrategy(new CouponDiscount(10));
        System.out.println("Final Price with Coupon Discount : " + cart.checkOut(200));//output 180.0
    }

}