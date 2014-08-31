package DesignPatterns.Strategy;

/**
 * Created by liliya on 24/08/2014.
 */
public class MiniDuckSimulator {

    public static void main(String [] args){
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        //pass the specific implementation as parameter in the setter method to change the behaviour at runtime
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
