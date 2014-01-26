package RecursionII;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 20/01/14
 * Time: 18:18
 * To change this template use File | Settings | File Templates.
 */
public class MemoizedFibonacci {

    private int [] precalculated=null;

    /**
     * Non-memoized fibonacci
     * @param n
     * @return fib(n)
     */
    public static int fib(int n){
        if(n==1||n==2){
            return 1;
        }
        else{
            int result=fib(n-1)+fib(n-2);
            return result;
        }
    }

    /**
     * memoized fibonacci implementation
     * @param n
     * @return either calculated value in the array or the return of a recursion call
     */
    public int fibM(int n){
        if(precalculated==null){
            initPrecalculatedArray(n);
        }
        if(precalculated[n-1]!=-1){
            return precalculated[n-1];
        }
        else{
            int result=fibM(n-1)+fibM(n-2);
            precalculated[n-1]=result;
            return result;
        }
    }

    /**
     * Used to initiate the pre-calculated array which will be used to store the interim recursion calculations
     * @param size
     */
    private void initPrecalculatedArray(int size){
        precalculated=new int[size];
        for(int i=0; i<precalculated.length;i++){
            precalculated[i]=-1; //to indicate not calculated yet
        }

        precalculated[0]=1; //represents fibonacci of 1-F(1)
        precalculated[1]=1;//represents fibonacci of 2-F(2)
    }

        public static void main( String [] args){

        //System.out.println(fib(45));



    }
}
