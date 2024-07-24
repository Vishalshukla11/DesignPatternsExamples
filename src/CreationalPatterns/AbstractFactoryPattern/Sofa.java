package CreationalPatterns.AbstractFactoryPattern;

/*What is the Abstract Factory Pattern?
The Abstract Factory Pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.

Real-Life Example
Think of a furniture store. You can buy different sets of furniture (Victorian, Modern). Each set includes a sofa, a chair, and a table. The store provides a way to get a complete set without you needing to know the specifics of each piece.
 * 
 */

 //abstract product A 
interface Sofa{

    void sit();

}