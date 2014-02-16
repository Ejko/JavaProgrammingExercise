package ConcurrencyBookExercise;

import org.junit.runners.model.RunnerBuilder;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 16/02/14
 * Time: 15:06
 * To change this template use File | Settings | File Templates.
 */

/**
 * This object implements the task that the thread will be driving
 */
public class LiftOff implements Runnable {

    protected int countDown=10;
    private static int taskCount=0;
    //id distinguishes between multiple instances of a task
    private final int id=taskCount++;

    public LiftOff(){}

    public LiftOff(int countDown){
        this.countDown=countDown;
    }

    public String status(){
        return "Thread #"+ id +"("+
                (countDown>0?countDown:"Liftoff!")+"), ";
    }
    @Override
    public void run() {
        //task's run specifies the actions as part of the task which is executing
        //modelled as a loop which will terminate given a certain condition
        while(countDown-->0){
            System.out.print(status());
            System.out.println();
            Thread.yield(); //suggests to the thread scheduler that it can switch to another task
        }
    }

}
