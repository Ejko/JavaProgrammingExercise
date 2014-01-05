package GenericList;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 15/12/13
 * Time: 14:01
 * To change this template use File | Settings | File Templates.
 */

/**
 * Sorted list as a subclass of a doubly linked list using generic types
 * Attributes in the superclass were changed to protected to enable access in this class
 * the class also extends Comparable to allow for the comparison of values of generic types
 * @param <T>
 */
public class SortedListImpl<T extends Comparable<T>> extends GenericListImpl<T>{

    public SortedListImpl(){
        super();
    }

    /**
     * The add method of GenericListImpl is overridden to allow for sorted list implementation
     * @param value
     */
    @Override
    /*
    empty list scenario
     */
    public void add(T value){
        if(head==null){
            head=new ListNode<T>(value);
            tail=head;
        }
        /**
         * new value is smaller than the value of the head element-new head
         */
        else if((head.getValue().compareTo(value)>=0)){
            ListNode<T> newHead=new ListNode<T>(value);
            head.setPrevious(newHead);
            newHead.setNext(head);
            head=newHead;
        }

        else{
            ListNode<T> current=head;
            while(current!=null){
                /**
                 * new value is larger than all others in the list-introduced at the end
                 */
                if(current.getNext()==null&&current.getValue().compareTo(value)<=0){
                    current.setNext(new ListNode<T>(value));
                    current.getNext().setPrevious(current);
                    tail=current.getNext();
                    break; //always break out if the value is added
                }
                /**
                 * new value is introduced between 2 other values in the list
                 */
                else if((current.getValue().compareTo(value)<=0)&&(current.getNext().getValue().compareTo(value)>0)){
                    ListNode<T> newItem=new ListNode<T>(value);
                    newItem.setPrevious(current);
                    newItem.setNext(current.getNext());
                    current.getNext().setPrevious(newItem);
                    current.setNext(newItem);
                    break;      //always break out if the value is added
                }
                /**
                 *loop until the appropriate location for the value is found
                 */
                else{
                    current=current.getNext();
                }
            }
        }


    }
}
