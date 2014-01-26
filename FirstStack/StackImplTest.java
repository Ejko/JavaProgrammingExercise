package FirstStack;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 05/01/14
 * Time: 16:00
 * To change this template use File | Settings | File Templates.
 */
import org.junit.*;
import static org.junit.Assert.*;

public class StackImplTest {

  @Test
  public void emptyStackCreated(){

      BasicStack myStack=new BasicStackImpls();

      assertTrue("Stack not created", myStack!=null);
  }

    /**
     * Testing if a new element is correctly added to the stack
     */
    @Test
    public void newElementAdded(){

        BasicStack myStack=new BasicStackImpls();
        StackNode node1=new StackNode(6);
        myStack.push(node1);
        int expected=6;
        int input=myStack.peek();

        assertEquals(input,expected);
    }

    /**
     * Testing if an element is correctly popped from the stack
     * Including that the last node value changes accordingly to the previous element
     */
    @Test

    public void elementPopped(){

        BasicStack myStack=new BasicStackImpls();
        StackNode node1=new StackNode(10);
        myStack.push(node1);
        StackNode node2=new StackNode(15);
        myStack.push(node2);
        StackNode node3=new StackNode(17);
        myStack.push(node3);

        myStack.pop();
        int result=myStack.peek();
        int expected=15;
        assertEquals(result, expected);
    }
    /**
     * Test if peeking at the last element returns the correct result
     */
    @Test
    public void peekElement(){
        BasicStack myStack=new BasicStackImpls();
        StackNode node1=new StackNode(121);
        myStack.push(node1);
        StackNode node2=new StackNode(173);
        myStack.push(node2);
        StackNode node3=new StackNode(356);
        myStack.push(node3);

        int expected=356;
        int actual=myStack.peek();

        assertEquals(expected, actual);
    }
    /**
     * Test if the empty() method delivers the expected functionality
     */
    @Test
    public void stackEmpty(){

        BasicStack myStack=new BasicStackImpls();
        StackNode node1=new StackNode(6);
        myStack.push(node1);
        myStack.pop();

        assertTrue(myStack.empty());


    }

}
