package BehavioralPatterns.ObserverPattern.WetherObserverImplementationClasses;

import BehavioralPatterns.ObserverPattern.Interfaces.WetherObserver;

public class TvDisplay implements WetherObserver
{

    @Override
    public void update(float temperature) {
       System.out.println("Tv Display: Temperature is now " + temperature + "°c");  }

}
