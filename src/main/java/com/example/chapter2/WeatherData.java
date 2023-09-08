package com.example.chapter2;

import com.example.chapter2.abstraction.Observer;
import com.example.chapter2.abstraction.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.onSuccess();
        }
    }

    public void notifyFailureObservers() {
        for (Observer observer : observers) {
            observer.onFailure();
        }
    }

    public void measurementsChanged(boolean readable) {
        if (readable)
            notifyObservers();
        else
            notifyFailureObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged(true);
    }

    public void simulateUnreadableException(){
        measurementsChanged(false);
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
