package Library;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 13/01/14
 * Time: 18:13
 * To change this template use File | Settings | File Templates.
 */
import org.junit.*;
import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void getAuthorNameTest(){
       Book testBook=new BookImpl("Joyce", "Ulysses");
        String expected="Joyce";
        String result=testBook.getAuthorName();

        assertEquals(expected, result);
    }

    @Test
    public void getBookTitle(){
        Book testBook=new BookImpl("Joyce", "Ulysses");
        String expected="Ulysses";
        String result=testBook.getBookTitle();

        assertEquals(expected, result);
    }



}
