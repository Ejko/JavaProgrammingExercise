package Library;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 13/01/14
 * Time: 20:07
 * To change this template use File | Settings | File Templates.
 */

import java.util.ArrayList;
import java.util.List;

public class LibraryImpl implements Library {

    private String name; //library name
    private ArrayList<Book> books;
    /**
     * The list of users registered with the library has been implemented as an array
     * Initial size is 1000
     */
    private String[] registeredUsers;

    public LibraryImpl(String name) {
        this.name = name;
        registeredUsers = new String[1000];
        books = new ArrayList<Book>();
    }

    @Override
    public String getLibName() {
        return name;
    }

    /**
     * an enum type has been used to allow the max books per user to be specified independently
     *
     * @return
     */
    @Override
    public int getMaxBooksPerUser() {

        return MaxBooksPerUser.MAX_BOOKS_PER_USER.getNum();

    }

    /**
     * Will return the id of a user provided their name
     * If user is not registered, an ID will automatically be created
     * The short hash code of each name is used as an ID
     * Note: this will guarantee uniqueness in most cases, better hashing algo is needed
     *
     * @param name
     * @return ID of the user
     */

    @Override
    public int getID(String name) {

        if (registeredUsers.length == 0) {
            int index = IDGenerator(name);
            registeredUsers[index] = name;
            return index;
        } else {
            for (int i = 0; i < registeredUsers.length; i++) {
                if (registeredUsers[i] == null) {

                } else if (registeredUsers[i].equals(name)) {
                    return i;
                }
            }
        }
        int index = IDGenerator(name);
        registeredUsers[index] = name;
        return index;
    }

    @Override
    public void addBook(String title, String author) {
        Book newBook = new BookImpl(title, author);
        if (books.contains(newBook)) {
            System.out.println("Book is already in the library");
        } else {
            books.add(newBook);
        }
    }

    @Override
    public String takeBook(String title) {

        String result="";
        for (int i = 0; i < books.size(); i++) {
                if(books.get(i)==null){

                }
                else if(books.get(i).getBookTitle().equals(title)&&!books.get(i).isTaken()){
                    books.get(i).setTaken(true);
                    result=books.get(i).getBookTitle();
                }
                else{
                    result=null;
                }
        }
        return result;
    }

    @Override
    public void returnBook(Book book) {
        //Checks if the book is actually part of the book catalogue
        if(!books.contains(book)){
            System.out.println("This book is not in the library");
        }
        else{
        book.setTaken(false);
        }
    }

    @Override
    public Book containsBook(String title) {
        Book contains=null;
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i)==null){

            }
            else if(books.get(i).getBookTitle().equals(title)){
               contains=books.get(i);
            }
        }
        return contains;
    }

    /**
     * Hashing function used to generate a users ID
     *
     * @param s
     * @return short hash( between 1 and 1000) of the name
     */
    public static int IDGenerator(String s) {
        int longID = s.hashCode();
        return HashUtilities.shortHash(longID);
    }

}

