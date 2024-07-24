package BehavioralPatterns.ObserverPattern.Interfaces;
/*Observer Pattern
Definition:
The Observer pattern is a way to allow an object (the subject) to notify other objects (observers) about changes in its state. The observers are automatically updated whenever the subject changes.

Real-Life Example:
Weather Station

Imagine a weather station that provides weather updates. 
You have multiple devices(e.g., a phone, a TV) that want to get the weather updates. 
 Whenever the weather changes, the weather station informs all devices.
 */

public interface WetherObserver
{
    void update(float temperature);   
}