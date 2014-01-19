package Library;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 13/01/14
 * Time: 18:30
 * To change this template use File | Settings | File Templates.
 */

import java.util.ArrayList;

/**
 * An interface that identifies a library user class
 */
public interface User {
    /**
     * A user name getter
     * @return string of the user name
     */
    public String getUserName();

    /**
     * A library ID getter
     * @return the string of the library ID
     */
    public int getLibraryID();

    /**
     * Sets the Library ID of the user
     * @param libraryID
     */
    public void setLibraryID(int libraryID);

    /**
     * Used to register new user at a library and obtain a user ID
     * @param lib the library object used for registration
     */
     public void register(Library lib);

    /**
     * returns the library object that the user is assigned to
     * @return an interface
     */
     public String getLibrary(Library lib);

}
