package ConcurrencyBookExercise;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 16/02/14
 * Time: 16:03
 * To change this template use File | Settings | File Templates.
 */
import java.util.concurrent.*;

public class CachedThreadPool {

    public static void main(String [] args){
        /**
         * Executor acts as a layer between the client and the task and manages execution of asynchronous tasks
         * An executor service knows how to build the appropriate context to execute runnable objects
         * the Cached Thread pool creates one thread per task
         * the service is created using the static Executors method which determines the kind of executor it will be
         */
        ExecutorService exec=Executors.newCachedThreadPool();
        for(int i=0; i<5; i++){
            exec.execute(new LiftOff());
        }
        //prevents new tasks from being submitted to the executor
        //current thread(in this case main will continue running all the tasks before shutdown was called)
        //program will finish as soon as all the tasks in the executor finish
        exec.shutdown();
    }
}
