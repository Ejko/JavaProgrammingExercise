package ConcurrencyBookExercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 16/02/14
 * Time: 15:45
 * To change this template use File | Settings | File Templates.
 */
public class Exercise1Main {

    public static void main(String [] args){
        ExecutorService exec= Executors.newCachedThreadPool();
        for(int i=0; i<5; i++){
           exec.execute(new Exercise1());
        }
        exec.shutdown();
    }
}
