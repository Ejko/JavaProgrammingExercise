package Library;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 13/01/14
 * Time: 18:23
 * To change this template use File | Settings | File Templates.
 */

/**
 * Class contains book details, implements the Book interface
 */
public class BookImpl implements Book {

    /**
     * The BookImpl object is immutable, once the attributes are initialized, they cannot be amended
     */

    private String authorName;
    private String bookTitle;
    private boolean taken;

    public BookImpl(String title, String author){
        this.authorName=author;
        this.bookTitle=title;
    }

    @Override
    public String getAuthorName() {
        return authorName;
    }

    @Override
    public String getBookTitle() {
        return bookTitle;
    }

    @Override
    public boolean isTaken() {
        return taken;
    }

    @Override
    public void setTaken(boolean status) {

        this.taken=status;
    }

}
