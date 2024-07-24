package CreationalPatterns.FactoryMethodpattern;

//concrete Products 
class ChocolateCake implements Cake {

    @Override
    public void Prepare() {
    System.out.println("Preparing choclate cake.");
    }
}