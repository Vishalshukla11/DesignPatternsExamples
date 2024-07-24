package CreationalPatterns.AbstractFactoryPattern;

class VictorianFurnitureFactory implements FurnitureFactory{

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
      }

    @Override
    public Chair createChair() {
        return new VictorianChair();
        }
    
}