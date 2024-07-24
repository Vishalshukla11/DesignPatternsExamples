package CreationalPatterns.PrototypePattern;

/*What is the Prototype Pattern?
The Prototype Pattern creates new objects by copying an existing object, known as the prototype.

Real-Life Example
Think of making paper dolls. You have a template (prototype) of a paper doll, and you create multiple copies of the doll using this template.
 */


interface Prototype{

 Prototype clone();

}