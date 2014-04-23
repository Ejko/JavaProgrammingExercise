package ConcurrencyII;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 17/02/14
 * Time: 22:12
 * To change this template use File | Settings | File Templates.
 */
public class TimedTask implements Runnable {
    @Override
    public void run() {
        try{
        Thread.sleep(1000);
       }
        catch(InterruptedException ex){
            //nothing to do, just sleep
        }
    }
}
