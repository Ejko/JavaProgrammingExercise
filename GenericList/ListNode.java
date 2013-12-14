package GenericList;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 14/12/13
 * Time: 11:22
 * To change this template use File | Settings | File Templates.
 */
public class ListNode<T>  {

    private T value;
    private ListNode<T> next;
    private ListNode<T> previous;

    public ListNode(T value){
        this.value=value;
        this.next=null;
        this.previous=null;

    }
    public T getValue() {
        return this.value;
    }

    public ListNode<T> getNext() {
        return this.next;
    }
    public void setNext(ListNode<T> node) {
        this.next=node;
    }
    public ListNode<T> getPrevious() {
      return this.previous;
    }

   public void setPrevious(ListNode<T> node) {
       this.previous=node;
   }




}

