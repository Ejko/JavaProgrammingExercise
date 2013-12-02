package IntegerBinaryTree;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 25/11/13
 * Time: 18:25
 * To change this template use File | Settings | File Templates.
 */
public class TreeGenerator {

   // private IntegerTreeNode root;

    public static void main(String [] args){

        IntegerTreeNode root=new IntegerTreeNode(6);
        root.add(9);
        root.add(5);
        root.add(8);
        root.add(11);
        root.add(3);
        root.add(12);
        root.add(17);
        root.add(20);
        root.add(18);


       // System.out.println(root.contains(8));
        //System.out.println(root.contains(6));
        //System.out.println(root.getMax());
        //System.out.println(root.getMin());
        System.out.println(root.toString2());

       // System.out.println(root.toString2());
        //System.out.println(root.depth());
        root.remove(3);
        root.remove(18);
        System.out.println(root.toString2());

    }


  }
