package BubbleSortList;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 23/11/13
 * Time: 12:33
 * To change this template use File | Settings | File Templates.
 */
public class BubbleSortImpl implements BubbleSort
{
    ListNode first=null;
    ListNode current=null;
    int size=0;

    @Override
    public void addToList(ListNode l) {
        if(first==null){
            first=l;
            current=first;
            size++;
        }
        else if(current.getNext()==null){
            ListNode prev=current;
            current.setNext(l);
            current=current.getNext();
            size++;
            }
    }

   // @Override
    //public void deleteFromList(int n) {
        //To change body of implemented methods use File | Settings | File Templates.
   // }

    @Override
    public void sortList() {
        current=null;
        int count=0;
        boolean sorted=false;
        do
       {
            if(first.getValue()>first.getNext().getValue()){
                current=first;
                current.setNext(current.getNext());
                first=first.getNext();
                first.setNext(current);
                System.out.println("Element: "+current.getValue());
                System.out.println("Next elem of current is: "+ current.getNext().getValue());
                System.out.println(" swapped with: "+first.getValue());
            }
            else if(current.getValue()>current.getNext().getValue()){
                ListNode holder=current;
                holder.setNext(holder.getNext().getNext());
                current=current.getNext();
                current.setNext(holder);
                System.out.println("Element: "+current.getValue());
                System.out.println(" swapped with: "+holder.getValue());
            }
           else{
                sorted=true;
            }
         //  printList();

       }
        while(!sorted);


    }

   public void printList(){
        ListNode curr;
        curr=first;
       // while(curr.getNext()!=null){
            System.out.println("Element: " +curr.getValue());
            curr=curr.getNext();
        //}
        //System.out.println("Size: "+size);

    }


}
