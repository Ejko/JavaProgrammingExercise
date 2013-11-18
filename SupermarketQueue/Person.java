package SupermarketQueue;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 17/11/13
 * Time: 21:42
 * To change this template use File | Settings | File Templates.
 */
public class Person {

    private String name;
    private int age;
    private Person nextPerson;

    public Person(String name, int age){
        this.name=name;
        this.age=age;
        this.nextPerson=null;
    }

    public void setNext(Person person){
        this.nextPerson=person;
    }
    public Person getNext(){
        return nextPerson;
    }


}

