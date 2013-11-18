package FirstQueue;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 18/11/13
 * Time: 20:30
 * To change this template use File | Settings | File Templates.
 */

/**
 * An interface which specifies the methods to be implemented by a queue
 */
public interface BasicQueue {

    /**
     * Inserts an element at the beginning of the queue
     */
    void insert(QueueNode q);

    /**
     * removes an element from the end of the queue
     */
    QueueNode retrieve();

    /**
     * returns the current size of the queue
     */
    int sizeQueue();

    }


