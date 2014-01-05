package GenericStack;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 14/12/13
 * Time: 22:36
 * To change this template use File | Settings | File Templates.
 */
public class StackGen {

    public static void main(String [] args){

        Stack<Integer> stackInt=new StackArrayImpl<Integer>(Integer.class);
        stackInt.push(99);
        stackInt.push(89);
        stackInt.push(78);
        stackInt.push(96);
        stackInt.push(101);
        stackInt.push(120);
        stackInt.push(143);
        stackInt.push(145);
        stackInt.print();
        stackInt.pop();
        stackInt.pop();
        stackInt.pop();
        stackInt.pop();
        stackInt.empty();
    }

}
