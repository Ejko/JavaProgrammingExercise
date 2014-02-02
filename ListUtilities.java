import BubbleSortList.BubbleSort;
import BubbleSortList.ListNode;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 16/11/13
 * Time: 16:22
 * To change this template use File | Settings | File Templates.
 */
public class ListUtilities {

    static IntegerNode convertToList (int [] array){
        IntegerNode first=null; //points to the first element in the list
        IntegerNode previous=null;  //points to the previous element in the list
        for(int i=0; i<array.length;i++){
           IntegerNode current=new IntegerNode(array [i]);//creates new object and populates with the array value
           if(first==null){ //if this is the first element in the list
           first=current;   //the first element and previous point to the first element
           previous=current;
           }
           else{
               previous.setNext(current);//previous is updated to reflect the back end of the list
               previous=current;
           }

        }

        return first;

        }

    static IntegerNode BubbleSort(IntegerNode n){

        IntegerNode first=n;
        boolean sorted=false;
        do{
            IntegerNode current=first;
            IntegerNode previous=null;
            boolean swapped=false;
            System.out.println("----");
            while(current.getNext()!=null){

                System.out.println("Curr--> " + current.getNumber());
                if(previous==null){
                    System.out.println("Prev-->null");
                }
                else{
                    System.out.println("Prev-->" + previous.getNumber());
                }

                if(current.getNumber()>current.getNext().getNumber()){
                    // current > next
                    if(previous==null){
                        first=current.getNext();
                    }
                    IntegerNode new_previous = current.getNext();
                    swapNodes(current, current.getNext(), previous);
                    swapped=true;
                    previous = new_previous;
                    // previous=previous.getNext();
                       // first=current;
                    System.out.println("When swap is called: "+swapped);
                }

                else {
                   previous=current;
                   current=current.getNext();
                    //swapped=false;
                    System.out.println("When swap is  not called: "+swapped);
                }

//                previous = current;
               // System.out.println("Next to compare: "+current.getNumber());
                //System.out.println("Previous:"+previous.getNumber());

            }

            if(!swapped){
                sorted=true;
                //  System.out.println("Swapped:"+swapped);
            }


        } while(!sorted);

        return first;
      }

    static void swapNodes(IntegerNode biggerItem, IntegerNode smallerItem, IntegerNode previous){
        System.out.println("Swapping old = " + biggerItem.getNumber() + ", new = " + smallerItem.getNumber());
        biggerItem.setNext(smallerItem.getNext());
        smallerItem.setNext(biggerItem);
        if(previous!=null){
        previous.setNext(smallerItem);
        }
    }

    static void printList(IntegerNode first){
        System.out.print("[");
        IntegerNode prev=null;
        while(first!=null){
            if(prev==null){
                System.out.println(first.getNumber() +", p=null");
            }
            else{
                System.out.println(first.getNumber() + ",  p="+prev.getNumber());
            }
            prev=first;
            first=first.getNext();


        }
        System.out.println("]");

    }

        public static void main(String [] args){

           // int [] array={1,2,3,4,5,6,7,8,9,10};
            //printList(convertToList(array));


            int [] arraySorted={7,2,5,10,34,12,0};
            IntegerNode list = convertToList(arraySorted);
            printList(list);
           // list = BubbleSort(list);
           // System.out.println("Sorted list:");
            printList(list);

    }


}
