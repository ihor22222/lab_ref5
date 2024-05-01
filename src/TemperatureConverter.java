public class TemperatureConverter {
    public double convertToFahrenheit(double celsiusTemperature) {
        double celsiusToFahrenheitFactor = 9.0 / 5.0;
        double fahrenheitOffset = 32.0;

        double fahrenheitTemperature = (celsiusTemperature * celsiusToFahrenheitFactor) + fahrenheitOffset;
        return fahrenheitTemperature;
    }
}
/*для 1го завдання*/