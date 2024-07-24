package BehavioralPatterns.ObserverPattern.WetherSubjectImplementationClass;

import java.util.ArrayList;
import java.util.List;

import BehavioralPatterns.ObserverPattern.Interfaces.WetherObserver;
import BehavioralPatterns.ObserverPattern.Interfaces.WetherSubject;

public class WetherStation implements WetherSubject
{
    private float temperature;

    private List<WetherObserver> observers= new ArrayList<>();

    public void setTemperature(float temperature)
    {
        this.temperature=temperature;
        notifyObserver();
    }

    @Override
    public void addObserver(WetherObserver observer) {
      observers.add(observer);
         }

    @Override
    public void removeObserver(WetherObserver observer) {
       observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(WetherObserver observer : observers)
        {
            observer.update(temperature);
        }
       }

}