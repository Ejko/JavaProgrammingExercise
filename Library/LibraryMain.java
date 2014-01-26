package Library;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 18/01/14
 * Time: 17:08
 * To change this template use File | Settings | File Templates.
 */
public class LibraryMain {


    String[][] SAMPLE_BOOK_AUTHORS = {
            {"Atlas Shrugged", "Ayn Rand"},
            {"Operating Systems", "Whoever"}
    };

    public void scriptOne() {
        Library library = new LibraryImpl("testing");
        for (String[] bookAuthor : SAMPLE_BOOK_AUTHORS) {
            library.addBook(bookAuthor[0], bookAuthor[1]);
        }




    }



    public static void main(String [] args){

     LibraryImpl library=new LibraryImpl("Grand Central");


     library.addBook("Atlas Shrugged", "Ayn Rand");
     library.addBook("Operating Systems", "W. Stallings");
     library.addBook("On the origin of species", "Charles Darwin");
     library.addBook("The Servile state", "Hillaire Bellog");
     library.addBook("Java", "O'Reilly");


     System.out.println("Your ID is: "+library.getID("Jonathan Smith"));

     library.takeBook("Atlas Shrugged", library.getID("Jonathan Smith"));
     System.out.println(library.nameOfBorrower("Atlas Shrugged"));
     library.returnBook(library.containsBook("Atlas Shrugged"));

     library.takeBook("Operating Systems", library.getID("Sheridan Jones"));
     library.takeBook("On the origin of species", library.getID("Sheridan Jones"));
     library.takeBook("Atlas Shrugged", library.getID("Sheridan Jones"));

     System.out.println("Users with books over maximum are: ");
     System.out.println(Arrays.toString(library.setMaxBookPolicy()));
     library.returnBook(library.containsBook("Atlas Shrugged"));
     System.out.println("Users with books over maximum are: "+ Arrays.toString(library.setMaxBookPolicy()));
     library.takeBook("The Servile state", library.getID("Sheridan Jones"));
     System.out.println("Users with books over maximum are: "+ Arrays.toString(library.setMaxBookPolicy()));

     System.out.println("Does anyone hold On the origin of species?");
     System.out.println("Book holder: "+library.nameOfBorrower("On the origin of species"));

    library.setMaxBooksPerUser(1);
        System.out.println("Users with books over maximum are: "+ Arrays.toString(library.setMaxBookPolicy()));
        library.setMaxBooksPerUser(1);
        System.out.println("Users with books over maximum are: "+ Arrays.toString(library.setMaxBookPolicy()));
    }

    public static <T> StringBuffer pp(T[] stuff) {
        StringBuffer buf = new StringBuffer();
        buf.append("[");
        for (T item : stuff) {
            buf.append(item.toString());
            buf.append(", ");
        }
        buf.append("]");
        return buf;
    }

    public static <T> String pp(Iterable<T> stuff) {
        String result = "";
        result += "[";
        for (T item : stuff) {
            result += item.toString();
            result += ", ";
        }
        result += "]";
        return result;
    }
}
