package StringStack;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 05/01/14
 * Time: 17:19
 * To change this template use File | Settings | File Templates.
 */

/**
 * The node of the dynamic structure used for implementing the stack
 */
public class StringStackNode {

    private String content;
    private StringStackNode next;

    public StringStackNode(String txt) {
        content = txt;
        next = null;
    }

    /**
     * Returns the string in this node
     */
    public String getText() {
        return content;
    }

    /**
     * Set the next node to point to the given node
     */
    public void setNext(StringStackNode node) {
        next = node;
    }

    /**
     * Set the next node to point to the given node
     */
    public StringStackNode getNext() {
        return next;
    }
}

