package ConcurrencyBookExercise;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 16/02/14
 * Time: 17:14
 * To change this template use File | Settings | File Templates.
 */
import java.util.concurrent.*;

/**
 * SinglethreadExecutor is like a FixedthreadPool with a size of one thread
 * Useful for any long life tasks, like listening to a connection
 * if more than one task is submitted to the single thread executor, they will be queued up
 */
public class SingleThreadExecutor {

    public static void main(String [] args){
        ExecutorService exec=Executors.newSingleThreadExecutor();
        for(int i=0; i<5;i++){
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }

}
