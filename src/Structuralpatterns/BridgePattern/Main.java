package Structuralpatterns.BridgePattern;

public class Main{
    public static void main(String args[])
    {
        Device t= new Tv();
        RremoteContral rc= new BasicRemote(t);

        rc.turnon();
        rc.turnoff();
    }

}