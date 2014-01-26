package GenericList;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 14/12/13
 * Time: 17:54
 * To change this template use File | Settings | File Templates.
 */

/**
 * Implements a doubly linked list using a generic type class parameter
 * This class is a super class of SortedListImpl
 * @param <T>
 */
public class GenericListImpl<T> implements GenericList<T> {
    /**
     * Fields have been set as protected, to allow subclasses to access them
     */
    protected ListNode<T> head;
    /**
     * Fields have been set as protected, to allow subclasses to access them
     */
    protected ListNode<T> tail;

    public void add(T value) {
        ListNode<T> newTail;
        if(head ==null){            //adding the first element in the list
            head =new ListNode<T>(value);
            newTail=head;
        }
        else{
            newTail = new ListNode<T>(value);   //adding an element at the end of the list
            tail.setNext(newTail);
            newTail.setPrevious(tail);
        }

        tail = newTail;
    }

    public void remove(T value) {
      ListNode<T> current=head;
      if(head.getValue().equals(value)){  //this case addresses removal of the head
          head=head.getNext();
          head.setPrevious(null);
      }
      else{
      while(current!=null){
          if(current.getValue().equals(value)){     //this case addresses removal of the tail
              if(current.getNext()==null){
                  current=current.getPrevious();
                  current.setNext(null);
                  tail=current;
              }
              else{
              ListNode<T> newCurrent;           //any other case for removal
              newCurrent=current.getNext();
              current.getPrevious().setNext(newCurrent);
              newCurrent.setPrevious(current.getPrevious());
              current=newCurrent;
              }
          }
          else{
              current=current.getNext();//keep looping through the list until the desired value is found or end is reached
             }
          }
      }
    }

    public void printList(){
        ListNode<T> current=head;
        while(current!=null){
            System.out.println("List value: "+current.getValue());
            current=current.getNext();
        }
    }

    public MyIteratingThingy<T> iterate() {
        return new MyIteratingThingy<T>(head);
    }

    public class MyIteratingThingy<T> {
        private ListNode<T> currentNode;

        public MyIteratingThingy(ListNode<T> head) {
            this.currentNode = head;
        }

        public T nextValue() {
            if (currentNode == null) {
                return null;
            }

            T value = currentNode.getValue();
            currentNode = currentNode.getNext();
            return value;
        }

    }
}
