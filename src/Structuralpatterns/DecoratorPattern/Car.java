package Structuralpatterns.DecoratorPattern;

/*4. Decorator Pattern
What is the Decorator Pattern?
The Decorator Pattern allows you to add new functionality to an object dynamically without changing its structure.

Real-Life Example
Imagine you have a basic car. You can add features like air conditioning, a sunroof, and GPS. Each feature is added independently and can be combined in different ways without altering the basic car.
 */

 //component 

interface Car{
    void assemble();

}