package Structuralpatterns.AdapterPattern;

/* What is the Adapter Pattern?
The Adapter Pattern acts as a bridge to make two incompatible interfaces work together by translating one interface into another.

Real-Life Example
Imagine you have a phone charger with a USB plug, but your wall socket only takes three-pin plugs. You use an adapter that has a USB socket on one side and a three-pin plug on the other. Now, you can charge your phone by connecting the charger to the adapter and the adapter to the wall socket. The adapter makes them compatible.
 */ 

interface NewPrintInterface{
    void print();

}