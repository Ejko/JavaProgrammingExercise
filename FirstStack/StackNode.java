package FirstStack;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 21/11/13
 * Time: 18:05
 * To change this template use File | Settings | File Templates.
 */
public class StackNode {

    private int value;
    private StackNode nextNode;     //for storing the next node
    private StackNode previousNode;  //storing a pointer to the previous node

    public StackNode(int val){
        this.value=val;
        this.nextNode=null;
        this.previousNode=null;
    }

    public int getValue(){
        return value;
    }
    public StackNode getNext(){
        return nextNode;
    }
    public StackNode getPrevious(){
        return previousNode;
    }
    public void setValue(int n){
        this.value=n;
    }
    public void setNextNode(StackNode sn){
        this.nextNode=sn;
    }
    public void setPrevious(StackNode sn){
        this.previousNode=sn;
    }

}
