package Structuralpatterns.BridgePattern;

class BasicRemote extends RremoteContral{

    public BasicRemote(Device device)
    {
        super(device);
    }

    @Override
    public void turnon() {
        device.turnon();
         }

    @Override
    public void turnoff() {
        device.turnoff();
         }

}