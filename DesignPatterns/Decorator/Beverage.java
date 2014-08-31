package DesignPatterns.Decorator;

/**
 * Created by liliya on 25/08/2014.
 */
public abstract class Beverage {

    String description = "Unknown beverage";

    protected Size size;

    public String getDescription(){
        return description + " " + size;
    }

    public abstract double cost();

    public Size getSize(){
        return size;
    }

    public void setSize(Size size){
        this.size = size;
    }


}
