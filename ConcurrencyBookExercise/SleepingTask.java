package ConcurrencyBookExercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 16/02/14
 * Time: 18:50
 * To change this template use File | Settings | File Templates.
 */
public class SleepingTask extends LiftOff {

    public void run(){
        try{
            while(countDown-->0){
                System.out.print(status());
                TimeUnit.MILLISECONDS.sleep(100);
            }
        }
        catch(InterruptedException ex){
            System.err.println("Interrupted");
        }
    }

    public static void main(String [] args){
        ExecutorService exec= Executors.newCachedThreadPool();
        for(int i=0; i<5; i++){
            exec.execute(new SleepingTask());
        }
        exec.shutdown();
    }

}
