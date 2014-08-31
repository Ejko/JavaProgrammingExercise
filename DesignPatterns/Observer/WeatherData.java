package DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by liliya on 25/08/2014.
 */
public class WeatherData extends Observable {

    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {  }

    public void measurementsChanged(){
        //indicate state has changed before notifying observers
        setChanged();
        notifyObservers();

    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();

    }
    //getter methods specified to allow observers to pull data as opposed to push it
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}
