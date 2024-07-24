package CreationalPatterns.FactoryMethodpattern;

class SimpleCakeFactory extends CakeFactory{

    @Override
    public Cake createCake(String type) {
       switch (type) {
        case  "chocolate":
            return new ChocolateCake();
        case "vanilla":
        return new VanillaCake();
        default:

           throw new IllegalArgumentException("Unknown cake type ");
       }
    }

}