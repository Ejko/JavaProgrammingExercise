package FirstStack;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 21/11/13
 * Time: 18:12
 * To change this template use File | Settings | File Templates.
 */

/**
 * This is a stack implementation using a doubly linked list
 * This list tracks the first and the last node in the stack
 */
public class BasicStackImpls implements BasicStack {

    private StackNode firstNode=null;
    private StackNode lastNode=null;
    private int size=0;     //used to keep track of the size of the stack

    @Override
    public void push(StackNode s) {
        System.out.println("Pushing "+ s.getValue()+ "...");
            if(firstNode==null){
            firstNode=s;
            lastNode=s;
            size++;
        }
        else if(lastNode.getNext()==null){
             StackNode e=lastNode;
             lastNode.setNextNode(s);
             lastNode=lastNode.getNext();
             lastNode.setPrevious(e);
             size++;
        }

    }

    @Override
    public int pop() {

       int popValue=0;      //used to store the value of the popped element
        if(empty()){
            System.out.println("Stack is empty");
             }
        else if(lastNode.getPrevious()==null){
            popValue=lastNode.getValue();
            lastNode=null;
            size--;
           // printPop(popValue);
            return popValue;
        }
        else if(lastNode.getNext()==null){
            popValue=lastNode.getValue();
            lastNode=lastNode.getPrevious();
            lastNode.setNextNode(null);
            size--;
         //   printPop(popValue);
        }
        return popValue;
    }

    @Override
    public int peek(){
        int result=0;
        if(empty()){
            System.out.println("Stack is empty");
        }
        else{
            result=lastNode.getValue();
        }
     return result;
    }

    @Override
    public boolean empty() {
       boolean isEmpty=true;
       if(size!=0){
           isEmpty=false;
       }
        return isEmpty;
    }

    public void printPop(int n){

        System.out.println("Popping....it's a  " + n);

    }

}
