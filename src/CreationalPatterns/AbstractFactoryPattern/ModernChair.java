package CreationalPatterns.AbstractFactoryPattern;

class ModernChair implements Chair{

    @Override
    public void sit() {
       System.out.println("Sitting on Modern chair ");
    }

}