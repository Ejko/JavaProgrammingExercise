package DesignPatterns.Strategy;

/**
 * Created by liliya on 24/08/2014.
 */
public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
