package DesignPatterns.Decorator;

/**
 * Created by liliya on 25/08/2014.
 */
public class HouseBlend extends Beverage {

    public HouseBlend(Size size){
        description = "house blend";
        this.size = size;
    }

    @Override
    public double cost() {
        if(size.equals(Size.TALL)){
            return 0.90;
        }
        else if(size.equals(Size.GRANDE)){
            return 1.00;
        }
        else return 1.10;

    }
}
