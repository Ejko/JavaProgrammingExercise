package ConcurrencyBookExercise;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 16/02/14
 * Time: 15:16
 * To change this template use File | Settings | File Templates.
 */
public class MainThread {


    public static void main(String [] args){
       //non-threaded execution
       LiftOff launch=new LiftOff();
       launch.run();
    }
}
