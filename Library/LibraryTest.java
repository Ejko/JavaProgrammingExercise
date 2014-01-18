package Library;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 13/01/14
 * Time: 20:04
 * To change this template use File | Settings | File Templates.
 */

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Before;

public class LibraryTest {

    Library libTest;

    @Before
    public void ObjectCreator(){
        libTest=new LibraryImpl("Central");
    }

    @Test
    public void maxNumBooksTest(){

        assertTrue(libTest.getMaxBooksPerUser()==5);
    }

    @Test
    public void getLibNameTest(){

        assertTrue(libTest.getLibName().equals("Central"));
    }

    @Test
    public void getIDTestNewUser(){
        User newUser=new UserImpl("John Smith");

         libTest.getID(newUser.getUserName());

    }

    @Test
    public void getIDExistingUserTest(){
        User user1=new UserImpl("John Smith");
        User user2=new UserImpl("Jennie Jones");
        User user3=new UserImpl("Liliya Stefa");
        libTest.getID("John Smith");
        libTest.getID("Jennie Jones");
        libTest.getID("Liliya Stefa");

       int expected=854;
       int result=libTest.getID("Jennie Jones");

        assertEquals(expected, result);

    }
    @Test
    public void uniqueIDTest(){

    }

    @Test
    public void addBookTest(){
        libTest.addBook("Atlas Shrugged", "Ayn Rand");

        String result=libTest.containsBook("Atlas Shrugged").getBookTitle();
        String expected="Atlas Shrugged";

        assertEquals(result, expected);
    }

    @Test
    public void takeBookTest(){
        libTest.takeBook("Narnia");

        assertTrue(libTest.containsBook("Narnia").isTaken());
    }

    @Test
    public void returnBookTest(){
        Book book1=new BookImpl("JFK","Narnia");
        libTest.returnBook(book1);
    }


}
