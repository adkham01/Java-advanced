package patterns.observer;

public class PhoneDisplay implements IObserver{

    private final WeatherStation weatherStation;

    public PhoneDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        double value = this.weatherStation.getTemperature() + weatherStation.getHumidity();
        System.out.println("Phone display: " + value);

    }
}
