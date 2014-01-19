package Library;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 13/01/14
 * Time: 18:10
 * To change this template use File | Settings | File Templates.
 */

/**
 * this interface defines class Book
 */
public interface Book {

    /**
     * A getter method for book author
     * @return author name
     */
    public String getAuthorName();

    /**
     * A getter method for book title
     * @return book title
     */
    public String getBookTitle();

    /**
     * Returns the status of the book
     * @return true if taken, false if not taken
     */
    public boolean isTaken();

    /**
     * Sets the book as taken if it has been
     * @param status true or false to update the book field with
     */
    public void setTaken(boolean status);

}

