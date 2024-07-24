package Structuralpatterns.BridgePattern;

class DVDPlayer implements Device
{

    @Override
    public void turnon() {
        System.out.println("turing on the DVD player");
        }

    @Override
    public void turnoff() {
        System.out.println("Truning off the DVD player");
         }
    
}