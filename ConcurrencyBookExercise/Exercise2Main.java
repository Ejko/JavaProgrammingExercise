package ConcurrencyBookExercise;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 16/02/14
 * Time: 15:58
 * To change this template use File | Settings | File Templates.
 */
import java.util.concurrent.*;
public class Exercise2Main {

    public static void main(String [] args){
        ExecutorService exec=Executors.newFixedThreadPool(5);
        for(int i=0; i<5; i++){
           // new Thread(new Exercise2(10)).start();
            exec.execute(new Exercise2(7));
        }
        exec.shutdown();
    }
}
