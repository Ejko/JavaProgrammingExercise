package ConcurrencyBookExercise;

import java.util.concurrent.Callable;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 16/02/14
 * Time: 18:23
 * To change this template use File | Settings | File Templates.
 */
public class Exercise2Callable implements Callable<Integer> {

    private int n;
    private int[] fibNums;

    public Exercise2Callable(int n){
        this.n=n;
        fibNums=new int [n];
    }


    @Override
    public Integer call() throws Exception {
       Integer sum=0;
        for(int i=0; i<fibNums.length-1; i++){
            if(i==1){
                fibNums[i]=1;
            }
            else if(i==0){
                fibNums[i]=0;
            }
            else{
                fibNums[i]=fibNums[i-1]+fibNums[i-2];
            }
        }
        for(int i=0; i<fibNums.length-1; i++){
            sum=sum+fibNums[i];
    }
        return sum;
    }


    private void printArr(){
        for(int i=0; i<fibNums.length-1; i++){
            System.out.print(fibNums[i]+", ");
        }
        System.out.println();
    }

    }


