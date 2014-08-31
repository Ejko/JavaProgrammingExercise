package DesignPatterns.Observer;

import org.omg.CORBA.Current;

/**
 * Created by liliya on 25/08/2014.
 */
public class WeatherStation {

    public static void main(String [] args){

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(180.00f, 65.00f, 30.4f);
        weatherData.setMeasurements(80.00f, 45.00f, 17.4f);
         weatherData.setMeasurements(18.00f, 6.00f, 3.4f);
    }
}
