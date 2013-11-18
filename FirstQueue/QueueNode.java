package FirstQueue;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 18/11/13
 * Time: 20:36
 * To change this template use File | Settings | File Templates.
 */
public class QueueNode {

    private int element;
    private QueueNode nextNode;

    public QueueNode(int el){
        this.element=el;
        nextNode=null;
    }

    public QueueNode getNext(){
        return nextNode;
    }
    public void setNext(QueueNode n){
       this.nextNode=n;
    }

    public int getElement(){
        return this.element;
    }
    public void setElement(int n){
        this.element=n;
    }

}
