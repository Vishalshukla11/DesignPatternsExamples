package CreationalPatterns.BuilderPattern;

class Main{
    public static void main(String args[])
    {
        Burger b = new Burger.BurgerBuilder()
        .setBun("Whole wheat Bun")
        .setpatty("Veg patty")
        .setsauce("Tamato sauce")
        .setvegitables("tamato,Lettuce")
        .build();
        System.out.println(b);


    }

}