package Structuralpatterns.BridgePattern;

class Tv implements Device{

    @Override
    public void turnon() {
        System.out.println("Turning on the tv");
       }

    @Override
    public void turnoff() {
        System.out.println("Turning off thr tv");
        }
    
}