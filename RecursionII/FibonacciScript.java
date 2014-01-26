package RecursionII;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 20/01/14
 * Time: 19:03
 * To change this template use File | Settings | File Templates.
 */
public class FibonacciScript {

    public static void main(String [] args){

        MemoizedFibonacci newFib=new MemoizedFibonacci();
        System.out.println(newFib.fibM(45));
    }
}
