package DesignPatterns.Factory;

/**
 * Created by liliya on 31/08/2014.
 */
public abstract class PizzaStore {

    //this is the factory method the functionality for which will be decoupled
    //for each pizza store
    public abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type){
        Pizza pizza=null;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
