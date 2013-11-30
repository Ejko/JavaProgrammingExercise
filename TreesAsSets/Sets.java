package TreesAsSets;

import TreesAsSets.IntSet;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 30/11/13
 * Time: 14:50
 * To change this template use File | Settings | File Templates.
 */
public class Sets {

    public static void main(String [] args){

        IntSet root=new TreeIntSet(7);
        root.add(8);
        root.add(10);
        root.add(3);
        root.add(5);
        root.add(11);
        root.add(5);
        System.out.println(root.toStr());
        //System.out.println(root.contains(7));
       // System.out.println(root.contains(10));
        //System.out.println(root.contains(8));
       // System.out.println(root.contains(5));
       // System.out.println(root.contains(3));
        //System.out.println(root.contains(11));

       System.out.print(root.containsVerbose(5));

       /*
        IntSet head=new ListIntSet(5);
        head.add(5);
        head.add(3);
        head.add(5);
        head.add(3);
        head.add(6);
        head.add(10);
        head.add(17);
        head.add(17);
        System.out.println(head.contains(17));
        System.out.println(head.toStr());
       // head.containsVerbose(6);
        System.out.println();
        System.out.println(head.containsVerbose(17));
        System.out.println(head.containsVerbose(6));
*/




    }

  // public void setHead(int n){
       // if(listHead==null){
           // listHead=new ListIntSet(n);
      //  }
   // }
}
