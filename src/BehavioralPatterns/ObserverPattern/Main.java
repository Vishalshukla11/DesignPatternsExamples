package BehavioralPatterns.ObserverPattern;
import BehavioralPatterns.ObserverPattern.Interfaces.WetherObserver;
import BehavioralPatterns.ObserverPattern.WetherObserverImplementationClasses.PhoneDisplay;
import BehavioralPatterns.ObserverPattern.WetherObserverImplementationClasses.TvDisplay;
import BehavioralPatterns.ObserverPattern.WetherSubjectImplementationClass.*;
public class Main
{
    public static void main (String args[])
    {
        //weather station is a child class of WetherSubject Interface 
        WetherStation sta= new WetherStation();

        //here wetherObserver is a interface 
        WetherObserver ph= new PhoneDisplay();
        WetherObserver tv= new TvDisplay();

        sta.addObserver(tv);
        sta.addObserver(ph);

        sta.setTemperature(25.0f);
    }

}