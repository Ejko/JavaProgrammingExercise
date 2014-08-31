package DesignPatterns.Strategy;

/**
 * Created by liliya on 24/08/2014.
 */
public class FlyRocketPowered implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I am flying with a rocket!");
    }
}
