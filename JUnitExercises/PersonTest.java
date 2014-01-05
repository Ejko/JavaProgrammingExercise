package JUnitExercises;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 05/01/14
 * Time: 15:01
 * To change this template use File | Settings | File Templates.
 */

import org.junit.*;
import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testNormalName(){
        Person p=new Person();
        String input="Dereck Robert Yssirt";
        String output=p.getInitials(input);
        String expected="DRY";
        assertEquals(output, expected);
    }

    @Test
    public void testExtraSpaceName(){
        Person p=new Person();
        String input="Liliya  Stefanova";
        String output=p.getInitials(input);
        String expected="LS";
        assertEquals("Initials are LS", output, expected);
    }
}
