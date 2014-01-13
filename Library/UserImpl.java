package Library;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 13/01/14
 * Time: 18:40
 * To change this template use File | Settings | File Templates.
 */

/**
 * This class implements the User interface
 * used to create new users
 */
public class UserImpl implements User {

    private String userName;
    private int libraryID;

       public UserImpl(String name){

        this.userName=name;
    }

    @Override
    public String getUserName() {

        return userName;
    }

    @Override
    public int getLibraryID() {

        return libraryID;
    }

    @Override
    public void setLibraryID(int libraryID) {

        this.libraryID=libraryID;
    }

    /**
     * This method assigns a unique library ID to the user
     * @param lib the library object used for registration
     */
    @Override
    public void register(Library lib){
        setLibraryID(lib.getId());
    }

    /**
     * Takes in a library object and returns the name of the library
     * @param lib
     * @return the library name
     */
    @Override
    public String getLibrary(Library lib){

        return lib.getName();

    }
}
