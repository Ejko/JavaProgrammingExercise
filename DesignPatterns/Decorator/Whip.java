package DesignPatterns.Decorator;

/**
 * Created by liliya on 25/08/2014.
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage b){
        this.beverage = b;
        size = beverage.getSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " whip";
    }

    @Override
    public double cost() {

        double cost = beverage.cost();
        Size beverage_size = beverage.getSize();
        if (beverage_size.equals(Size.TALL)) {
            cost += .10;
        } else if (beverage_size.equals(Size.GRANDE)) {
            cost += .20;
        } else {
            cost += .30;
        }

        return cost;
    }
}
