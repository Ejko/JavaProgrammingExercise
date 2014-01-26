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

import java.util.ArrayList;
import java.util.List;

public class LibraryTest {

    LibraryImpl libTest;

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
        libTest.addBook("Java", "Unknown");

       String result=libTest.containsBook("Java").getBookTitle();
       String expected="Java";

        assertEquals(result, expected);
    }

    @Test
    public void takeBookTest(){
        libTest.addBook("Narnia", "JFK");
        libTest.takeBook("Narnia", 1234);

        assertTrue(libTest.containsBook("Narnia").isTaken());
    }

    @Test
    public void returnBookTest(){
        libTest.addBook("Narnia", "JFK");
        libTest.returnBook(libTest.containsBook("Narnia"));

        assertFalse(libTest.containsBook("Narnia").isTaken());
    }

    @Test
    public void readerCountTest(){
        libTest.getID("Jeff Bridges");
        libTest.getID("Susan Sarandon");
        libTest.getID("Tom Jones");

        int expected=3;
        int result=libTest.getReaderCount();

        assertEquals(expected, result);
    }

    @Test
    public void bookCountTest(){
        libTest.addBook("1", "A");
        libTest.addBook("2", "B");

        int expected=2;
        int result=libTest.getBookCount();

        assertEquals(expected, result);
    }

    @Test
    public void borrowBookCountTest(){
        libTest.getID("Jimmy");
        libTest.getID("Janet");
        libTest.addBook("1", "A");
        libTest.addBook("2", "B");
        libTest.addBook("3", "C");
        libTest.takeBook("1",858 );
        libTest.takeBook("2",238);

        int expected=2;
        int result=libTest.getBorrowedBooksCount();

        assertEquals(expected, result);
    }

    @Test
    public void borrowedBooksByUserTest(){
        libTest.getID("Jimmy");
        libTest.getID("Janet");
        libTest.addBook("1", "A");
        libTest.addBook("2", "B");
        libTest.addBook("3", "C");

        libTest.takeBook("1",858 );
        libTest.takeBook("2",238);

        List<Book> bookPerUserExpected=new ArrayList<Book>();
        bookPerUserExpected.add(libTest.containsBook("1"));

        List<Book> actual=libTest.getBorrowedBooksByUser(858);

        assertEquals(bookPerUserExpected, actual);
    }

    @Test
    public void getRegisteredUserTest(){
        libTest.getID("Jimmy");
        libTest.getID("Janet");
        libTest.getID("Petra");

        String [] usersExpected=new String[1000];
        usersExpected[858]="Jimmy";
        usersExpected[238]="Janet";
        usersExpected[678]="Petra";

        String [] usersActual=new String[10];
        usersActual=libTest.getRegisteredUsers();

        assertArrayEquals(usersExpected, usersActual);

    }

    @Test
    public void getUsersWithBooksTest(){

        libTest.getID("Jimmy");
        libTest.getID("Janet");
        libTest.getID("Petra");
        libTest.addBook("1", "A");
        libTest.addBook("2", "B");
        libTest.addBook("3", "C");
        libTest.takeBook("1", 858);
        libTest.takeBook("2", 678);

        String [] borrowersExpected=new String [1000];
        borrowersExpected[858]="Jimmy";
        borrowersExpected[678]="Petra";

        String [] borrowersActual=libTest.getUsersWithBooks();

        assertArrayEquals(borrowersActual, borrowersExpected);
    }
    @Test
    public void getBorrowerNameTest(){
        libTest.getID("Jimmy");
        libTest.getID("Janet");
        libTest.getID("Petra");
        libTest.addBook("1", "A");
        libTest.addBook("2", "B");
        libTest.addBook("3", "C");
        libTest.takeBook("1", 858);
        libTest.takeBook("2", 678);

        String borrowerName = libTest.nameOfBorrower("1");
        assertEquals("Jimmy", borrowerName);

        assertTrue(libTest.nameOfBorrower("1").equals("Jimmy"));
    }

    /**
     * Test passed successfully after amending the values of max books in the enum accordingly
     */
    @Test
    public void setMaxBookPolicyTest(){
        libTest.getID("Jimmy");
        libTest.getID("Janet");
        libTest.getID("Petra");
        libTest.addBook("1", "A");
        libTest.addBook("2", "B");
        libTest.addBook("3", "C");
        libTest.takeBook("1", 858);
        libTest.takeBook("2", 858);
        libTest.takeBook("3", 858);

        String [] expected=new String[1000];
        expected[0]=null;
        String [] actual=libTest.setMaxBookPolicy();

        assertArrayEquals(expected, actual);

    }



}
