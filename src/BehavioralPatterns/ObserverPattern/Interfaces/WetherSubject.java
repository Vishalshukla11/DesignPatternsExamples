package BehavioralPatterns.ObserverPattern.Interfaces;
public interface WetherSubject{
    void addObserver(WetherObserver observer);
    void removeObserver(WetherObserver observer);
    void notifyObserver();

}