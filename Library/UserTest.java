package Library;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 13/01/14
 * Time: 18:33
 * To change this template use File | Settings | File Templates.
 */

import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class UserTest {

    @Before
    public void StartMessage(){
        System.out.println("Starting test....");
    }
    /**
     * testing the user name getter
     */
    @Test
    public void UserNameGetterTest(){

        User newUser= new UserImpl("Sam");

        String expected="Sam";
        String result=newUser.getUserName();

        assertEquals(expected, result);
    }

    /**
     * testing the library ID getter method
     */
    @Test
    public void libraryIDGetterTest(){

        User newUser=new UserImpl("Jonnie");
        newUser.setLibraryID(12345);

        int expected=12345;
        int result=newUser.getLibraryID();

        assertEquals(expected, result);
    }

    /**
     * testing the library ID setter method
     */
    @Test
    public void libraryIDSetterTest(){
        User newUser=new UserImpl("Jonnie");
        newUser.setLibraryID(12345);

        int expected=12345;
        int result=newUser.getLibraryID();

        assertEquals(expected, result);
    }
    @Test
    public void registerTest(){
        Library lib=new LibraryImpl("Central");
        User newUser=new UserImpl("Jonnie Cash");
        newUser.register(lib);

        assertTrue(newUser.getLibraryID()==950);
    }

    @Test
    public void getLibraryTest(){

        Library lib=new LibraryImpl("Central");
        User newUser=new UserImpl("Jonnie");

        assertTrue(newUser.getLibrary(lib).equals("Name"));
    }

    @Test
    public void getBorrowedBooksTest(){

        User newUser=new UserImpl("Gary Smith");

        Library lib=new LibraryImpl("Central");
        lib.addBook("a", "c");
        lib.takeBook("a", newUser.getLibraryID());


    }



}
