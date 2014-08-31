package DesignPatterns.Decorator;

/**
 * Created by liliya on 25/08/2014.
 */
public class DarkRoast extends Beverage {

    public DarkRoast(Size size){

        description = "Dark roast";
        this.size = size;
    }

    @Override
    public double cost() {
        if(size.equals(Size.TALL)){
            return 0.99;
        }
        else if(size.equals(Size.GRANDE)){
            return 1.05;
        }
        else return 1.25;

    }
}
