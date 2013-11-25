package IntegerBinaryTree;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 25/11/13
 * Time: 18:03
 * To change this template use File | Settings | File Templates.
 */

/**
 * In this tree structure, bigger integers are added to the right node
 * Smaller than the current integer are added to the left node
 */
public class IntegerTreeNode {

    private int value;
    private IntegerTreeNode leftNode;
    private IntegerTreeNode rightNode;

    public IntegerTreeNode(int n){
        this.value=n;
        this.leftNode=null;
        this.rightNode=null;
    }

    public void add(int newNumber){
        if(newNumber>this.value){   //check if number to be added is bigger than the current value
            if(rightNode==null){   //if yes, check if the right node is null-meaning the current one was a leaf
                rightNode=new IntegerTreeNode(newNumber);
            }
            else{
                rightNode.add(newNumber);  //otherwise keep trying the next right node, until leaf is reached
            }
        }
        else{
            if(leftNode==null){
                leftNode=new IntegerTreeNode(newNumber);
            }
            else{
                leftNode.add(newNumber);
            }
        }

    }

    public boolean contains(int n){
        if(n==this.value){
            return true;
        }
        else if(n>this.value){
            if(rightNode==null){
                return false;
            }
            else{
                return rightNode.contains(n);
            }
        }
        else {
            if(leftNode==null){
                return false;
            }
            else{
                return leftNode.contains(n);
            }
        }

    }

    public int getMax(){
        if(this.rightNode==null){
            return this.value;
        }
        else{
           return rightNode.getMax();
        }
    }

    public int getMin(){
        if(this.leftNode==null){
            return this.value;
        }
        else{
            return leftNode.getMin();
        }
    }
}
