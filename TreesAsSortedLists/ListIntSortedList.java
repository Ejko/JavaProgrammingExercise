package TreesAsSortedLists;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 01/12/13
 * Time: 00:28
 * To change this template use File | Settings | File Templates.
 */
public class ListIntSortedList implements IntSortedList {

    private SortedListNode head;

        @Override
    public void add(int n) {
        if(head==null){
            head=new SortedListNode(n);
            return;
        }
        SortedListNode current=head;
        SortedListNode previous=null;
        while(current!=null){
            if(n<head.getValue()){
                SortedListNode oldHead=head;
                head=new SortedListNode(n);
                head.setNext(oldHead);
                previous=head;

            }
            else if(n<current.getValue()){
                SortedListNode newNum=new SortedListNode(n);
                previous.setNext(newNum);
                previous=newNum;
                newNum.setNext(current);
                return;
            }
            else if(current.getNext()==null){
                current.setNext(new SortedListNode(n));
                System.out.println("New value at the end is: "+current.getNext().getValue());
                return;
            }
            previous=current;
            current=current.getNext();
        }

     }

    @Override
    public boolean contains(int n) {
        SortedListNode current=head;
        do{
            if(current.getValue()!=n){
                current=current.getNext();
            }
            else{
                return true;
            }
        return false;
        }
        while(current.getNext()!=null);

    }

    @Override
    public String toStr() {
        SortedListNode current=head;
        String list="";
        while(current!=null){
            list=list+current.getValue()+",";
            current=current.getNext();
        }
        return list;
    }



    public static void main(String [] args){

       ListIntSortedList sortList=new ListIntSortedList();
       sortList.add(4);
       sortList.add(2);
       sortList.add(6);
       sortList.add(5);
       sortList.add(7);
       sortList.add(13);
       sortList.add(9);
       sortList.add(1);
       System.out.println(sortList.toStr());

    }
}
