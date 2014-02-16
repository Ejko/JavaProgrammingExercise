package ConcurrencyBookExercise;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.*;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 16/02/14
 * Time: 17:32
 * To change this template use File | Settings | File Templates.
 */

public class CallableDemo {
    public static void main(String [] args){
        ExecutorService exec=Executors.newCachedThreadPool();
        //submut produces a Future object parameterized to teh particular type returned by Callable

        ArrayList<Future<String>> results=new ArrayList<Future<String>>();
        for(int i=0; i<10; i++){
            //the executorservice submit method is used for callable tasks
            results.add(exec.submit(new TaskWithResult(i)));
        }
        for(Future<String> fs:results){
            try{
                //get() blocks until completion; get() is used to fetch the result
                //of the Future list
                //can use isDone to check if the task has completed
                System.out.println(fs.get());
            }
            catch(InterruptedException ex){
                System.out.println(ex);
                return;
            }
            catch(ExecutionException ex){
                System.out.println(ex);
                return;
            }
            finally{
                exec.shutdown();
            }
        }
    }
}
