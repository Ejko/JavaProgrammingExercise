package DesignPatterns.Strategy;

/**
 * Created by liliya on 24/08/2014.
 */
public class FlyWithWings implements FlyBehaviour
{
    @Override
    public void fly() {
        System.out.println("I am flying!");
    }


}
