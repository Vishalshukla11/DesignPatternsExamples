package BehavioralPatterns.ObserverPattern.WetherObserverImplementationClasses;

import BehavioralPatterns.ObserverPattern.Interfaces.WetherObserver;

public class PhoneDisplay implements WetherObserver{

    @Override
    public void update(float temperature) {
        System.out.println("Phone Display :Temperature is now " + temperature + "°c");  }

}