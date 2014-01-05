package GenericList;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 14/12/13
 * Time: 14:31
 * To change this template use File | Settings | File Templates.
 */

/**
 * Class used for creating new linked lists
 */
public class Company {

    public static void main(String [] args){

        Company myCompany=new Company();
        myCompany.launch();
    }

    public void launch(){

        /**
         * Creating 2 double linked lists with employee names and NI numbers, to demonstrate
         * generic linked lists
         */
        GenericList<String> empNames=new GenericListImpl<String>();
        empNames.add("Caroline");
        empNames.add("Susan");
        empNames.add("Robert");
        empNames.add("Roger");
        empNames.add("Vanessa");
        GenericList<Integer> empNI=new GenericListImpl<Integer>();
        empNI.add(12345);
        empNI.add(45678);
        empNI.add(49475);
        empNI.add(34567);
        empNI.add(12348);
        empNames.printList();
        empNI.printList();
        empNames.remove("Caroline");
        empNI.remove(12345);
        empNI.remove(12348);
        empNames.printList();
        empNI.printList();

        /**
         * Creating a new sorted list, where each new entry is introduced at the correct location
         * Using an integer list for this purpose
         */
        GenericList<Integer> sortie=new SortedListImpl<Integer>();
        sortie.add(5);
        sortie.add(9);
        sortie.add(3);
        sortie.add(15);
        sortie.add(19);
        sortie.add(2);
        sortie.remove(3);
        sortie.add(15);
        sortie.add(13);
        sortie.printList();

    }


}
