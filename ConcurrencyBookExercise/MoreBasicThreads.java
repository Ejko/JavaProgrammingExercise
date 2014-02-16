package ConcurrencyBookExercise;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 16/02/14
 * Time: 15:35
 * To change this template use File | Settings | File Templates.
 */
public class MoreBasicThreads {

    public static void main(String [] args){
        for(int i=0; i<5; i++){
            //main thread starts off 5 other threads
            new Thread(new LiftOff()).start();
        }
        System.out.println("Waiting for lift off");
    }
    /**
     * The execution of the separate tasks is mixed together as the threads are swapped in and out
     * The swapping is controlled by the thread scheduler
     * If there are multiple processors, the thread will distribute the threads amongst the processors
     */
}
