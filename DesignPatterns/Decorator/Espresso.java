package DesignPatterns.Decorator;

/**
 * Created by liliya on 25/08/2014.
 */
public class Espresso extends Beverage {

    public Espresso(Size size) {
        description = "Espresso";
        this.size = size;
    }

    @Override
    public double cost() {
        if (size.equals(Size.TALL)) {
            return 1.45;
        } else if (size.equals(Size.GRANDE)) {
            return 1.50;
        } else return 1.70;

    }

}