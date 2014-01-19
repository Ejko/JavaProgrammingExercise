package Library;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 13/01/14
 * Time: 18:59
 * To change this template use File | Settings | File Templates.
 */
public interface Library {

    /**
     * Checks the maximum books per user to be borrowed at any time
     * @return max number of books possible
     */
     public int getMaxBooksPerUser();

    /**
     * Getter for library name
     * @return name of the library
     */
    public String getLibName();

    /**
     * Assigns an id to a new user or returns the id of an existing user based on their name
     * @param name
     * @return LibraryID for the user
     */
    public int getID(String name);

    /**
     * Adds a new book to the list of books in the library
     * @param title
     * @param author
     */

    public void addBook(String title, String author);

    /**
     * If the book is not taken, mark it as taken and return
     * If it is taken return null
     * @param title
     * @return book title being taken or null
     */
    public Book takeBook(String title, int userId);

    /**
     * Marks a book as not taken
     * @param book
     */

    public void returnBook(Book book);

    /**
     * returns the number of registered users in the library
     * @return num of users
     */
    public int getReaderCount();

    /**
     * Number of books at the library
     * @return number of books
     */
    public int getBookCount();

    /**
     * Number of borrowed books in the library
     * @return num borrowed books
     */
    public int getBorrowedBooksCount();

    /**
     * returns a list of all books borrowed by a user
     * @return list of borrowed books
     */
    public ArrayList<Book> getBorrowedBooksByUser(int userID);

    /**
     * a list of all users in the library, borrowing or not
     */
    public String [] getRegisteredUsers();

    /**
     * A list of all users who have borrowed books
     * @return list of users
     */
    public String [] getUsersWithBooks();

    /**
     * Name of the user borrowing a specific title at the moment
     * @param title
     * @return name of the borrower
     */
    public String nameOfBorrower(String title);

}
