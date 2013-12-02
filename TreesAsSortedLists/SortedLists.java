package TreesAsSortedLists;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 01/12/13
 * Time: 00:06
 * To change this template use File | Settings | File Templates.
 */
public class SortedLists {

    public static void main(String [] args){

        IntSortedList root=new TreeIntSortedList(8);
        root.add(19);
        root.add(8);
        root.add(2);
        root.add(5);
        root.add(4);
        root.add(6);
        root.add(1);
        root.add(0);
        root.add(-5);
        root.add(25);
        System.out.println(root.toStr());
        System.out.println(root.contains(8));
        System.out.println(root.contains(19));
        System.out.println(root.contains(5));
        System.out.println(root.contains(2));

    }
}
