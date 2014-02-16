package Concurrency;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 10/02/14
 * Time: 19:34
 * To change this template use File | Settings | File Templates.
 */
public class Counter {

    private int n=0;

    public synchronized void increase(){
     n++;
    }

    public int getCount(){
        return n;
    }
}
