package com.example;


import com.example.chapter2.CurrentConditionsDisplay;
import com.example.chapter2.ForecastDisplay;
import com.example.chapter2.WeatherData;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Chapter2 {

    @Test
    void contextLoads() {
        WeatherData weatherData = new WeatherData();

        new CurrentConditionsDisplay(weatherData);
        new ForecastDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.simulateUnreadableException();
    }
}
