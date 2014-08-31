package DesignPatterns.Strategy;

/**
 * Created by liliya on 24/08/2014.
 */
public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I am a model duck!");
    }
}
