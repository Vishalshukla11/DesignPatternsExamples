package Structuralpatterns.DecoratorPattern;

public class Main
{
    public static void main(String args[])
    {
        Car spc = new Sportscar(new BasicCar());
        spc.assemble();

        System.out.println();

        Car Luxc= new LuxuryCar(new BasicCar());
        Luxc.assemble();
    }
}