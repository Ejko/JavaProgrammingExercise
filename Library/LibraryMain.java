package Library;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 18/01/14
 * Time: 17:08
 * To change this template use File | Settings | File Templates.
 */
public class LibraryMain {

    public static void main(String [] args){

        Library lub=new LibraryImpl("Central");
        //System.out.println(lub.getID("Jessie"));

      //  System.out.println(lub.getID("Jennie Jones"));
       // System.out.println(lub.getID("Jonnie Cash"));

       // lub.addBook("Narnia", "Nana");
        System.out.println(lub.getID("Jimmy"));
        System.out.println(lub.getID("Janet"));
        System.out.println(lub.getID("Petra"));

        lub.addBook("a", "b");
        lub.addBook("c", "d");

        lub.takeBook("a", 858);

        System.out.print(lub.nameOfBorrower("a"));

        //System.out.println(lub.getBookCount());


    }
}
