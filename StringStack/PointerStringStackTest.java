package StringStack;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 05/01/14
 * Time: 18:55
 * To change this template use File | Settings | File Templates.
 */
import org.junit.*;
import static org.junit.Assert.*;

public class PointerStringStackTest {

    /**
     * Creating a common object to use for all the tests
     */
    StringStack myStringStack;

    @Before
    public void ObjectCreator(){
        myStringStack=new PointerStringStack();
    }

    /**
     * Adding new element to stack
     */
    @Test
    public void addNewElement(){
        myStringStack.push("banana");

        String result= myStringStack.peek();
        String expected="banana";

        assertEquals(result, expected);
    }

    /**
     * Popping element from a stack more than one element
     */
     @Test
    public void popElement(){
         myStringStack.push("radish");
         myStringStack.push("fennel");
         myStringStack.push("tomato");

         String result=myStringStack.pop();

         String expected="tomato";

         assertEquals(result, expected);

     }

    /**
     * Popping an element from an empty stack
     */
    @Test
    public void popFromEmptyStack(){

        String result=myStringStack.pop();
        String expected=null;

        assertEquals(result, expected);
    }

    /**
     * Peeking at an element from an empty stack
     */
    @Test
    public void peekAtEmptyStack(){

        String result=myStringStack.peek();
        String expected=null;

        assertEquals(result, expected);
    }

    /**
     * peek at a non-empty stack
     */
    @Test
    public void peekAtStack(){

        myStringStack.push("Africa");
        myStringStack.push("Asia");

        String result=myStringStack.peek();
        String expected="Asia";

        assertEquals(expected, result);
    }

    /**
     * check if stack is empty
     */
    @Test
    public void isEmpty(){

        assertTrue(myStringStack.isEmpty());

        myStringStack.push("Europe");

        assertFalse(myStringStack.isEmpty());
    }

 }
