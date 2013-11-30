package TreesAsSets;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 30/11/13
 * Time: 18:26
 * To change this template use File | Settings | File Templates.
 */

/**
 * An implementation of the IntSet interface using a linked list structure
 */
public class ListIntSet implements IntSet {
    private int value;
    private ListIntSet next;

    public ListIntSet(int n){
        this.value=n;
        this.next=null;
    }
    public int getValue(){
        return this.value;
    }
    public ListIntSet getNext(){
        return this.next;
    }
    @Override
    public void add(int n) {
        ListIntSet first=this;
        ListIntSet current=first;
        //iteration was used instead of recursion to avoid this resetting itself when checking for duplicates
        while(current.getNext()!=null){
            current=current.getNext();
        }
         if(current.getNext()==null){
             if(first.contains(n)){   //using the contains method, check whether the value already exists in the list
                //nothing will be added if the list already contains this value
             }
             else{
                current.next=new ListIntSet(n);
                current=current.next;
            }
         }
    }
    @Override
    public boolean contains(int n) {
        ListIntSet current=this;
        do{
            if(current.value!=n){
                current=current.getNext();
             }
            else{
                return true;
            }
        }
        while(current!=null);
       return false;
    }
    @Override
    public boolean containsVerbose(int n) {
        //boolean contains=false;
        ListIntSet current=this;
        do{
            if(current.value!=n){
                System.out.println( "Number checked: "+ current.value);
                current=current.getNext();

            }
            else{
                return true;
            }

        }
        while(current!=null);
        return false;
    }
    @Override
    public String toStr() {
        String list=Integer.toString(this.value);
        ListIntSet current=this;
       while(current.next!=null){
           list=list+","+current.getNext().value;
           current=current.getNext();
       }
    return list;

    }
}
