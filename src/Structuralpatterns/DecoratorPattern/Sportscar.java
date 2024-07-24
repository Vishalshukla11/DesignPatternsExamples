package Structuralpatterns.DecoratorPattern;

class Sportscar extends  CarDecorator{
    public Sportscar(Car car)
    {
        super(car);
    }

    public void assemble()
    {
        super.assemble();
        System.out.println("adding features of sports car.");
    }

}