package NoahsArk;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 02/12/13
 * Time: 20:58
 * To change this template use File | Settings | File Templates.
 */
public abstract class Animal {

    private String name;

    public Animal(String name){
        this.name=name;
    }


    public abstract String makeSound();

}
