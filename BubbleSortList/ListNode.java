package BubbleSortList;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 23/11/13
 * Time: 11:20
 * To change this template use File | Settings | File Templates.
 */
public class ListNode {

    private int value;
    private ListNode nextNode;


    public ListNode(int n){
        this.value=n;
        this.nextNode=null;
            }

    public  int getValue(){

        return value;
     }
    public ListNode getNext(){
        return nextNode;
    }

    public void setValue(int n){
        this.value=n;
    }
    public void setNext(ListNode l){
        this.nextNode=l;
    }

}
