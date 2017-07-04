package ch2_observer.jdk_vers;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(880.0f, 625.3f, 33120.4f);
        weatherData.setMeasurements(812, 720, 21239.2f);
        weatherData.setMeasurements(728, 930, 2239.2f);
    }
}
