package FirstStack;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 22/11/13
 * Time: 22:11
 * To change this template use File | Settings | File Templates.
 */
public class Stacker {

    public static void main(String [] args){

        BasicStack stack1=new BasicStackImpls();
        BasicStack stack2=new BasicStackImpls();

        StackNode nodeA=new StackNode(2);
        stack2.push(nodeA);
        StackNode nodeB=new StackNode(4);
        stack2.push(nodeB);
        StackNode nodeC=new StackNode(6);
        stack2.push(nodeC);
        stack2.pop();
        stack2.pop();
        stack2.pop();
        stack2.pop();


        StackNode node1=new StackNode(5);
        stack1.push(node1);
        StackNode node2=new StackNode(8);
        stack1.push(node2);
        StackNode node3=new StackNode(12);
        stack1.push(node3);
        stack1.pop();
        StackNode node4=new StackNode(13);
        stack1.push(node4);
        stack1.pop();
        stack1.pop();
        stack1.pop();
        stack1.pop();
        stack1.empty();

    }
}
