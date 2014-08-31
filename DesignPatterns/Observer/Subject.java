package DesignPatterns.Observer;

/**
 * Created by liliya on 25/08/2014.
 */
public interface Subject {

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();

}
