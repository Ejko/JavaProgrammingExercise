package TreesAsSortedLists;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 01/12/13
 * Time: 11:31
 * To change this template use File | Settings | File Templates.
 */
public class SortedListNode {

    private int value;
    private SortedListNode nextNode;

    public SortedListNode(int n){
        this.value=n;
        this.nextNode=null;
    }

    public int getValue(){
        return this.value;
    }
    public SortedListNode getNext(){
        return this.nextNode;
    }

    public void setValue(int n){
        this.value=n;
    }

    public void setNext(SortedListNode s){
        this.nextNode=s;
    }
}
