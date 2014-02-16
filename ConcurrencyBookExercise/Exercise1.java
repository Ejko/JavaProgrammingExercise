package ConcurrencyBookExercise;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 16/02/14
 * Time: 15:42
 * To change this template use File | Settings | File Templates.
 */
public class Exercise1 implements Runnable {

    public Exercise1(){
        System.out.println("Kick off task...");
    }
    @Override
    public void run() {
       // for(int i=0; i<3; i++){
            System.out.println("Message");
            Thread.yield();
            //System.out.println("Message");
           // Thread.yield();
           // System.out.println("Message");
            // Thread.yield();
        //}
        System.out.println("Terminating...");
    }
}
