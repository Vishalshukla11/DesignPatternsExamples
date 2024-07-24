package CreationalPatterns.FactoryMethodpattern;

/*
What is the Factory Method Pattern?
The Factory Method Pattern defines an interface for creating an object but lets subclasses alter the type of objects that will be created.

Real-Life Example
Imagine a cake shop. You can order different types of cakes (chocolate, vanilla, strawberry). The cake shop decides the type of cake to create based on your order. You don’t need to know how the cakes are made; you just place the order.
*/

//product Interface 

interface Cake{
    void Prepare();
    

}