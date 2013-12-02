/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 17/11/13
 * Time: 12:33
 * To change this template use File | Settings | File Templates.
 */
public class SortedIntegerList {

   IntegerNodeDouble first=null;

   public void addSortedElement(int n){

       IntegerNodeDouble newNumber=new IntegerNodeDouble(n);
       if(first==null){
           first=newNumber;
           return;
        }
     //
       IntegerNodeDouble  current=first;
       while(current!=null){
          if(current.getPrevious()==null && newNumber.getNumber()<current.getNumber()){
              first=newNumber;
              newNumber.setNext(current);
              current.setPrevious(newNumber);
              return;
           }

          else if(newNumber.getNumber()<current.getNumber()){
              newNumber.setPrevious(current.getPrevious());
              current.getPrevious().setNext(newNumber);
              current.setPrevious(newNumber);
              newNumber.setNext(current);
              return;
          }
          else if(current.getNext()==null){
              current.setNext(newNumber);
              newNumber.setPrevious(current);
              return;
          }
          else{
           current=current.getNext();
         }

     }
   }
    public void sortedPrint(){
        IntegerNodeDouble current=first;
        System.out.print("Numbers are: [");
        while(current!=null){
            System.out.print(current.getNumber() + ", ");
            current=current.getNext();
        }
        System.out.println("]");
    }

    public static void main(String [] args){

        SortedIntegerList list1=new SortedIntegerList();
        list1.addSortedElement(1);
        list1.addSortedElement(3);
        list1.addSortedElement(2);
        System.out.println("List 1= [1,3,2]");
        list1.sortedPrint();


        SortedIntegerList list2=new SortedIntegerList();
        list2.addSortedElement(7);
        list2.addSortedElement(4);
        list2.addSortedElement(9);
        list2.addSortedElement(12);
        list2.addSortedElement(3);
        list2.addSortedElement(6);

        System.out.println("List 2= [7,4,9,12,3,6]");
        list2.sortedPrint();



       /* SortedIntegerList automateSortedList=new SortedIntegerList();

        int n;

        do{
            System.out.print("Enter a number: ");
            n=Integer.parseInt(System.console().readLine());
            automateSortedList.addSortedElement(n);
        }
        while(n!=0);

        automateSortedList.sortedPrint();*/

    }
}
