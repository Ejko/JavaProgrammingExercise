package SupermarketQueue;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 17/11/13
 * Time: 22:38
 * To change this template use File | Settings | File Templates.
 */
public class Supermarket {

    PersonQueue queue=new PersonQueueImpl();

    public void addPerson(Person p){
        queue.insert(p);
    }

    public Person servePerson(){

        return queue.retrieve();

    }

}
