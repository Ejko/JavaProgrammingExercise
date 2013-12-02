package BubbleSortList;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 23/11/13
 * Time: 13:27
 * To change this template use File | Settings | File Templates.
 */
public class ListSorter {

    public static void main(String [] args){

    BubbleSortImpl sorter=new BubbleSortImpl();

    ListNode node1=new ListNode(7);
    sorter.addToList(node1);
    ListNode node2=new ListNode(3);
    sorter.addToList(node2);
    ListNode node3=new ListNode(2);
    sorter.addToList(node3);
    ListNode node4=new ListNode(10);
    sorter.addToList(node4);
    sorter.printList();
    sorter.sortList();
    sorter.printList();
    }

}
