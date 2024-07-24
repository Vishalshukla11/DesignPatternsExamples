package CreationalPatterns.PrototypePattern;

class PaperDoll implements Prototype{
    private String name;

    public PaperDoll(String name)
    {
        this.name=name;
    }

    @Override
    public Prototype clone()
    {
        return new PaperDoll(this.name);
    }

    @Override
    public String toString()
    {
        return "PaperDoll [name=" + name + "]";
    }
    
}