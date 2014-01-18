package Library;

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
    public String takeBook(String title);

    /**
     * Marks a book as not taken
     * @param book
     */

    public void returnBook(Book book);

    /**
     * Checks if the library catalogue contains a book
     * @param title
     * @return true of false
     */
    public Book containsBook(String title);

}
