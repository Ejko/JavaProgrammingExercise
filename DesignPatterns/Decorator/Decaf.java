package DesignPatterns.Decorator;

/**
 * Created by liliya on 25/08/2014.
 */
public class Decaf extends Beverage {

    public Decaf(Size size){
        description = "Decaf";
        this.size = size;

    }
    @Override
    public double cost() {
        if(size.equals(Size.TALL)){
            return 1.05;
        }
        else if(size.equals(Size.GRANDE)){
            return 1.25;
        }
        else return 1.40;

    }
}
