package DesignPatterns.Strategy;

/**
 * Created by liliya on 24/08/2014.
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a real mallard duck");
    }
}
