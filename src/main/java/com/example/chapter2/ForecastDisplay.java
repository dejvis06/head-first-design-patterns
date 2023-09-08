package com.example.chapter2;

import com.example.chapter2.abstraction.DisplayElement;
import com.example.chapter2.abstraction.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("Forecast: Watch out for cooler, rainy weather");
    }

    public void onFailure() {
        System.err.println("Forecast: Unreadable data");
    }

    public void onSuccess() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
}
