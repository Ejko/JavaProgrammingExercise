package ConcurrencyII;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Incrementor  extends RecursiveTask<Integer>{

    public static ForkJoinPool fjPool=new ForkJoinPool();

    private int theNumber;

    public Incrementor(int x){
        theNumber=x;
    }

    @Override
    protected Integer compute() {   //returns a value which is the result of the computation
        return theNumber+1;
    }

    public static void main(String [] args){
        int fortyThree=fjPool.invoke(new Incrementor(42));
        System.out.println(fortyThree);
    }
}
