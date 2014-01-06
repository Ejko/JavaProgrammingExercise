package StringStack;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 05/01/14
 * Time: 17:17
 * To change this template use File | Settings | File Templates.
 */

/**
 * A basic stack of strings
 */
public interface StringStack {

    /*
 * Pushes a new string onto the stack
 */
    void push(String newText);

    /*
     * Retrieves the last element from the stack and returns it.
     * If the stack is empty, returns null.
     */
    String pop();

    /*
     * Returns the last element from the stack (does not remove it).
     * If the stack is empty, returns null.
     */
    String peek();

    /*
     * Returns true if the stack contains no elements,
     * false otherwise.
     */
    boolean isEmpty();
}

