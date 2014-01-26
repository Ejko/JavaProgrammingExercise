package SupermarketQueue;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 17/11/13
 * Time: 21:39
 * To change this template use File | Settings | File Templates.
 */
public interface PersonQueue {

    /**
     * Adds another person to the queue
     */

    void insert(Person person);

    /**
     * removes a person from the queue
     */
    Person retrieve();

    /**
     * views name of a person inserted into the queue or retrieved from the queue
     */
    String viewPerson(Person person);


    }


