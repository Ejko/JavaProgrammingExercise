package DesignPatterns.Strategy;

/**
 * Created by liliya on 24/08/2014.
 */
public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
