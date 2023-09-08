package com.example.chapter2;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Test
    void contextLoads() {
        WeatherData weatherData = new WeatherData();

        new CurrentConditionsDisplay(weatherData);
        new ForecastDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.simulateUnreadableException();
    }
}
