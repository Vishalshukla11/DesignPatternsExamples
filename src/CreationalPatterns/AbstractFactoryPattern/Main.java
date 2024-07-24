package CreationalPatterns.AbstractFactoryPattern;

public class Main{
    public static void main(String args[])
    {
        //FurnitureFactory f= new VictorianFurnitureFactory();
        FurnitureFactory f = new ModernFurnitureFactory();
        Sofa s= f.createSofa();
        Chair c= f.createChair();

        s.sit();
        c.sit();
    }

}
