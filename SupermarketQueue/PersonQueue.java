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

    }

