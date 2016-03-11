/**
 * Created by Admin on 11.03.2016.
 */
public class Temperatrue {
    public static void main(String[] args){
    convertTemperatureToFahrenheit toFahrenheit=new convertTemperatureToFahrenheit(100);
        convertTemperatureToCelcium toCelcium=new convertTemperatureToCelcium(212);
        System.out.print("Our temperature in Fahrenheit =");
        System.out.println(toFahrenheit.getFahrenheit());
        System.out.print("Our temperature in Celsius =");
        System.out.println(toCelcium.getCelsius());
    }
}
