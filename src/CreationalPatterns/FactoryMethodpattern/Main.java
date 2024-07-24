package CreationalPatterns.FactoryMethodpattern;
public class Main{
    public static void main(String args[])
    {
        CakeFactory f= new SimpleCakeFactory();
        Cake c= f.createCake("chocolate");
        c.Prepare();
    }


}