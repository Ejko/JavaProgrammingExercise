package GenericStack;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 14/12/13
 * Time: 15:38
 * To change this template use File | Settings | File Templates.
 */
public interface Stack<T extends Number> {

    /**
     * Pushes a new object onto the stack
     * @param object
     */
    void push (T object);

    /**
     * Pops an object off the top of the stack
     * @return
     */
    T pop();

    /**
     * Prints the list of elements in the stack
     */
    void print();

    /**
     * checks if the stack is empty
     * @return true or false
     */
    boolean empty();

}
