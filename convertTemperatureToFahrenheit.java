/**
 * Created by Admin on 11.03.2016.
 */
public class convertTemperatureToFahrenheit {
    private float fahrenheit;
    public float getFahrenheit() {
        return fahrenheit;
    }

    convertTemperatureToFahrenheit(float temperature){
        fahrenheit=32f+1.8f*temperature;

    }
}