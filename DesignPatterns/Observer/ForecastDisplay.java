package DesignPatterns.Observer;

import java.util.Observable;
import java.util.Observer;
/**
 * Created by liliya on 25/08/2014.
 */
public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.92f;
    private float lastPressure;
    Observable observable;

    public ForecastDisplay(Observable obs){
        this.observable = obs;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        //display code here

    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData wd = (WeatherData) o;
            lastPressure = currentPressure;
            currentPressure = wd.getPressure();
            display();
        }
    }
}
