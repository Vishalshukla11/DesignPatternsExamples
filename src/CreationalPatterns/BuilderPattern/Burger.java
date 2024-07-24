/* What is the Builder Pattern?
The Builder Pattern separates the construction of a complex object from its representation so that the same construction process can create different representations.

Real-Life Example
Think of making a burger at a fast-food restaurant. You can have different types of burgers with various ingredients. The process of making the burger (adding ingredients in a specific order) remains the same, but the final burger can vary.
*/

package CreationalPatterns.BuilderPattern;

class Burger{
    private String bun;
    private String patty;
    private String sauce;
    private String vegitables;

    private Burger(BurgerBuilder b)
    {
        this.bun =b.bun;
        this.patty =b.patty;
        this.sauce = b.sauce;
        this.vegitables = b.vegitables;

    }
    public static class BurgerBuilder{
        private String bun;
        private String patty;
        private String sauce;
        private String vegitables;
    
        public BurgerBuilder setBun(String bun){
            this.bun=bun;
            return this;
        }
    
        public BurgerBuilder setpatty(String patty)
        {
            this.patty=patty;
            return this;
        }
    
        public BurgerBuilder setsauce(String sauce)
        {
            this.sauce=sauce;
            return this;
        }
    
        public BurgerBuilder setvegitables(String vegitables)
        {
            this.vegitables=vegitables;
            return this;
        }
    
        public Burger build()
        {
            return new Burger(this);
        }

    
    }
    
    @Override
    public String toString()
    {
        return "Burger [bun=" + bun + ", patty=" + patty + ", sauce=" + sauce + ", vegitables=" + vegitables + "]";
    }



}