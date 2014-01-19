package Library;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 13/01/14
 * Time: 20:07
 * To change this template use File | Settings | File Templates.
 */

import java.util.*;

public class LibraryImpl implements Library {

    private String name; //library name
    private ArrayList<Book> books;
    private HashMap<Integer,ArrayList<Book>> borrows; // a hash map to hold all the books borrowed by a user

    /**
     * The list of users registered with the library has been implemented as an array
     * Initial size is 1000
     */
    private String[] registeredUsers;

    public LibraryImpl(String name) {
        this.name = name;
        registeredUsers = new String[1000];
        books = new ArrayList<Book>();
        borrows=new HashMap<Integer,ArrayList<Book>>();
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
    public Book takeBook(String title, int userId) {

        Book result=null;
        for (Book currentBook : books) {
                if(currentBook==null){
                }
                else if(currentBook.getBookTitle().equals(title)&&!currentBook.isTaken()){
                    currentBook.setTaken(true);

                    ArrayList<Book> booksBorrowedByUser = borrows.get(userId);

                    if(booksBorrowedByUser == null){
                        booksBorrowedByUser = new ArrayList<Book>();
                        borrows.put(userId, booksBorrowedByUser);
                    }
                    booksBorrowedByUser.add(currentBook);
                    result=currentBook;
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
    @Override
    public int getReaderCount() {
        int readerCount=0;
        for(int i=0; i<registeredUsers.length;i++){
            if(registeredUsers[i]!=null){
                readerCount++;
            }

        }
        return readerCount;
    }
    @Override
    public int getBookCount() {
        return books.size();
    }

    @Override
    public int getBorrowedBooksCount() {
        int borrowedBooks=0;
        for(Book currentBook:books){
            if(currentBook==null){
            }
            else if(currentBook.isTaken()){
                borrowedBooks++;
            }
        }
        return borrowedBooks;
    }

    @Override
    public ArrayList<Book> getBorrowedBooksByUser(int userID) {

        if(borrows.get(userID)==null){
            return null;
        }
        else{
        return borrows.get(userID);
        }
    }

    @Override
    public String[] getRegisteredUsers() {

        return registeredUsers;
    }

    @Override
    public String[] getUsersWithBooks() {
        String [] usersWithBooks=new String [1000];
        Set<Integer> borrowerIDs=borrows.keySet();
        for(int currentRecord: borrowerIDs){
            for(int i=0; i<registeredUsers.length;i++){
                if(currentRecord==i){
                    usersWithBooks[i]=registeredUsers[i];
                }
            }
        }
        return usersWithBooks;
    }

    @Override
    public String nameOfBorrower(String title) {
        Integer userKey=0;
        String borrowerName="";
        Book bookObj=null;
        for(Book current: books){
            if(!current.getBookTitle().equals(title)) {
                continue;
            }

            bookObj=containsBook(title);

            for(Map.Entry<Integer, ArrayList<Book>> entry: borrows.entrySet()){
                    ArrayList<Book> borrowedBooks=entry.getValue();
                    if(borrowedBooks.contains(bookObj)){
                        userKey=entry.getKey();
                        System.out.println("User key is:"+userKey);
                        System.out.println("Book name: "+bookObj.getBookTitle());
                        borrowerName=registeredUsers[userKey];

                        System.out.println("User in array: "+registeredUsers[userKey]);
                        return borrowerName;
                         }
            }
        }
        System.out.println("Borrower Name: "+borrowerName);
        return null;
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

