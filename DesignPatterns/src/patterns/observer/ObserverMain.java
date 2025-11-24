package patterns.observer;

public class ObserverMain {
    static void main() {
        WeatherStation weatherStation = new WeatherStation();
        IObserver observer = new PhoneDisplay(weatherStation);
        weatherStation.addObserver(observer);
        weatherStation.setTemperature(10);
        weatherStation.setHumidity(50);
        weatherStation.notifyObservers();

    }
}
