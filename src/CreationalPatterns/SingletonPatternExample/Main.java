package CreationalPatterns.SingletonPatternExample;

class Main
{
    public static void main(String args[])
    {
        President p = President.getInstance();
        p.leadCountry();
    }
}