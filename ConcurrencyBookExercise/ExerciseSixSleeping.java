package ConcurrencyBookExercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 16/02/14
 * Time: 18:57
 * To change this template use File | Settings | File Templates.
 */
public class ExerciseSixSleeping implements Runnable {
    @Override
    public void run() {
        try{
            long time=(long) Math.abs(Math.random()*10);
            TimeUnit.SECONDS.sleep(time);
            System.out.println("Sleep time: "+time+" s");
        }
        catch(InterruptedException ex){
            System.out.println("Interrupted");
            }
    }

    public static void main(String args []){

        ExecutorService exec= Executors.newCachedThreadPool();
        System.out.print("Enter a number of tasks: ");
        int tasks=Integer.parseInt(System.console().readLine());
        for(int i=0; i<tasks;i++){
            exec.execute(new ExerciseSixSleeping());
        }
        exec.shutdown();

    }
}
