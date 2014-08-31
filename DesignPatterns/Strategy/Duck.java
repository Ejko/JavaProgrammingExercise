package DesignPatterns.Strategy;

/**
 * Created by liliya on 24/08/2014.
 */
public abstract class Duck {

    protected FlyBehaviour flyBehaviour;
    protected QuackBehaviour quackBehaviour;

    public Duck(){

    }

    public abstract void display();

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void setFlyBehaviour(FlyBehaviour fb){   //used to dynamically set fly behaviour at runtime
        flyBehaviour=fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb){   //used to dynamically set quack behaviour at runtime
        quackBehaviour = qb;
    }

    public void swim(){
        System.out.println("All ducks swim, even decoys!");
    }
}
