package Structuralpatterns.BridgePattern;

/*What is the Bridge Pattern?
The Bridge Pattern separates an object’s abstraction from its implementation so that the two can vary independently.

Real-Life Example
Think of a remote control (abstraction) that can work with different devices like a TV, DVD player, and
 sound system (implementations). The remote sends commands, but how these commands are executed depends on the device.
 */

abstract class  RremoteContral{
    protected Device device;

    public RremoteContral(Device device)
    {
        this.device=device;
    }

    public abstract void turnon();
    public abstract void turnoff();

}