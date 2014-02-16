package ConcurrencyBookExercise;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 16/02/14
 * Time: 15:49
 * To change this template use File | Settings | File Templates.
 */
public class Exercise2 implements Runnable {

    private int n;
    private int[] fibNums;

    public Exercise2(int n){
        this.n=n;
        fibNums=new int [n];
    }


    @Override
    public void run() {
        for(int i=0; i<fibNums.length-1; i++){
            if(i==0||i==1){
                fibNums[i]=1;
            }
            else{
            fibNums[i]=fibNums[i-1]+fibNums[i-2];
            }
        }
        printArr();
    }

    private void printArr(){
        for(int i=0; i<fibNums.length-1; i++){
            System.out.print(fibNums[i]+", ");
        }
        System.out.println();
    }
}
