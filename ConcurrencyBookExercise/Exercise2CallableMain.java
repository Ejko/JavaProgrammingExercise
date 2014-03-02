package ConcurrencyBookExercise;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 16/02/14
 * Time: 18:26
 * To change this template use File | Settings | File Templates.
 */
import java.util.concurrent.*;
import java.util.List;
import java.util.*;

public class Exercise2CallableMain {

    public static void main(String [] args){

        ExecutorService exec=Executors.newCachedThreadPool();
        List<Future<Integer>> result=new ArrayList<Future<Integer>>();
        for(int i=0; i<=10; i++){
            result.add(exec.submit(new Exercise2Callable(i)));
        }
        for(Future<Integer> fi: result){
            try{
                System.out.println(fi.get());
            }
            catch(InterruptedException ex){
                //do nothing
            }
            catch(ExecutionException ex){
                //do nothing
            }
            finally{
                exec.shutdown();
            }
        }

    }
}
