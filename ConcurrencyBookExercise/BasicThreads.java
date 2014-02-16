package ConcurrencyBookExercise;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 16/02/14
 * Time: 15:23
 * To change this template use File | Settings | File Templates.
 */
public class BasicThreads {

    //the main thread starts the t thread, the 2 threads can run in parallel
    //this allows for the message in main to be displayed prior to the end of the start call
    public static void main(String [] args){
        //creating a new thread to drive the LiftOff object
        Thread t=new Thread(new LiftOff());
        // a thread constructor needs a Runnable object only
        t.start();
        //start initializes the thread and then calls the Runnable's run
        System.out.println("Waiting for the lift off");
    }
}
