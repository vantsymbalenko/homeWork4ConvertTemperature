/**
 * Created by Admin on 11.03.2016.
 */
public class convertTemperatureToCelcium {
    private float celsius;
    public float getCelsius() {
        return celsius;
    }

    convertTemperatureToCelcium(float temperature){
        celsius=(temperature-32f)/1.8f;
    }

}
