package StringStack;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 05/01/14
 * Time: 17:20
 * To change this template use File | Settings | File Templates.
 */

/**
 * Implementation of a string stack using a dynamic data structure linked list
 */

public class PointerStringStack  implements StringStack{
    /**
     * The head of the stack-the visible node
     */

    private StringStackNode head;

    public PointerStringStack(){
        head=null;
    }

    @Override
    public void push(String newText) {
        StringStackNode newNode = new StringStackNode(newText);
        if (head != null) {
            newNode.setNext(head);
        }
        head = newNode;
    }
    @Override
    public String pop() {
        if (head == null) {
            return null;
        }
        String result = head.getText();
        head = head.getNext();
        return result;
    }

    @Override
    public String peek() {
        if(head==null){
            return null;
        }
        else{
            return head.getText();
        }
    }
    @Override
    public boolean isEmpty() {
        if(getSize()==0){
            return true;
        }
        else{
            return false;
        }
    }
    public int getSize() {
        int result=0;
        StringStackNode currentNode=head;
        while(currentNode!=null){
            currentNode=currentNode.getNext();
            result++;
        }
       return result;
    }

}
