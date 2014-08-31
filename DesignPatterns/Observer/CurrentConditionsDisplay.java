package DesignPatterns.Observer;

/**
 * Created by liliya on 25/08/2014.
 */

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        //take in observable and use it to add the observer to the watch list
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F  degrees and " + humidity + "% humidity");
    }

    //pass observable to retrieve updates using the getter methods
    @Override
    public void update(Observable observable, Object obj) {
        if (observable instanceof WeatherData) {
            WeatherData wd = (WeatherData) observable;
            this.temperature = wd.getTemperature();
            this.humidity = wd.getHumidity();
            display();
        }
    }

}
