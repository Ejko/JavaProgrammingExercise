package DesignPatterns.Strategy;

/**
 * Created by liliya on 24/08/2014.
 */
public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
