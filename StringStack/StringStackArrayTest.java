package StringStack;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 05/01/14
 * Time: 18:10
 * To change this template use File | Settings | File Templates.
 */

import org.junit.*;
import static org.junit.Assert.*;

public class StringStackArrayTest {

    StringStack myArrayStack;

    @Before
    public void ObjectCreator(){
        myArrayStack=new StringStackArrayImpl();
    }
    /**
     * Adding a new element to the stack
     */
    @Test
    public void addingNewElement(){

        myArrayStack.push("Liliya");

        String result=myArrayStack.peek();
        String expected="Liliya";

        assertEquals(expected, result);
    }

    /**
     * Peeking into an empty stack
     */
    @Test
    public void peekIntoEmptyStack(){

        String result=myArrayStack.peek();
        String expected=null;

        assertEquals(result, expected);
    }

    /**
     * Popping an element from a non-empty stack
     */
    @Test
    public void popElement(){
        myArrayStack.push("papple");
        myArrayStack.push("banana");
        myArrayStack.push("potato");
        myArrayStack.push("banana");

        myArrayStack.pop();

        String result=myArrayStack.peek();
        String expected="potato";

        assertEquals(result, expected);
    }

    /**
     * Popping element from an empty stack
     */
    @Test
    public void popFromEmptyStack(){

        String result=myArrayStack.pop();
        String expected=null;

        assertEquals(expected, result);
    }


}
