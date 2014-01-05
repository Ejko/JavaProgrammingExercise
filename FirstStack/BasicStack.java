package FirstStack;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 21/11/13
 * Time: 18:04
 * To change this template use File | Settings | File Templates.
 */
/**
 * Interface used for implementation of a basic stack structure
 */

public interface BasicStack {

    /**
     * Inserts an element at the beginning of the stack
     */
    void push(StackNode s);

    /**
     * Removes and element from the beginning of the stack
     */
    int pop();

    /**
     * returns true if the stack is empty, false otherwise
     */
    boolean empty();

    /**
     * Returns the top element of the stack without removing it
     */
    int peek();

}

