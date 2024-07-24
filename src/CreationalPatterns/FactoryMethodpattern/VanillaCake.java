package CreationalPatterns.FactoryMethodpattern;

class VanillaCake implements Cake {

    @Override
    public void Prepare() {
       System.out.println("Preparing Vanilla Cake.");
    }

}