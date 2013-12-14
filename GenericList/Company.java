package GenericList;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 14/12/13
 * Time: 14:31
 * To change this template use File | Settings | File Templates.
 */
public class Company {

    //private ListNode<String> nameListStart;
   // private ListNode<Integer> niListStart;

    public static void main(String [] args){

        Company myCompany=new Company();
        myCompany.launch();
    }

    public void launch(){

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
        //empNames.printList();
       // empNI.printList();
        empNames.remove("Caroline");
        empNI.remove(12345);
        empNI.remove(12348);
        empNames.printList();
        empNI.printList();

    }


}
