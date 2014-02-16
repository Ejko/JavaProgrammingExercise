package ConcurrencyBookExercise;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 16/02/14
 * Time: 17:07
 * To change this template use File | Settings | File Templates.
 */
import java.util.concurrent.*;

/**
 * thread allocation(expensive operation) is done up-front and the number of threads is fixed
 * In any of the thread pools, existing threads are automatically re-used if possible
 * Any tasks which have no threads available to drive them must wait until one is available
 */
public class FixedThreadPool {

    public static void main(String [] args){
        //constructor argument is the number of threads to be created
        ExecutorService exec=Executors.newFixedThreadPool(5);
        for(int i=0; i<5; i++){
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}
