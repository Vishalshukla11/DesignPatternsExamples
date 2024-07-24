/*
1. Singleton Pattern
What is the Singleton Pattern?
The Singleton Pattern ensures a class has only one instance and provides a global point of access to it.

Real-Life Example
Imagine the president of a country. There is only one president at any given time. Whenever you refer to the president, it's always the same person.

*/
package CreationalPatterns.SingletonPatternExample;

public class President{
    // create private static instance of the class 
    private static President instance;

    //make the constructor private to prevent instantiation
    private President()
    {

    }

    //prvide a public method to get instance 
    public static President getInstance()
    {
        if(instance==null)
        {
            instance = new President();
        }
        return instance;
    }

    public void leadCountry()
    {
        System.out.println("Leading the country....");
    }

}