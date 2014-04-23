package dry;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 26/01/14
 * Time: 01:13
 * To change this template use File | Settings | File Templates.
 */
public class Person {

    private String name;

    public Person(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }
}
