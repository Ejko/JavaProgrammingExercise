package Concurrency;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 10/02/14
 * Time: 19:33
 * To change this template use File | Settings | File Templates.
 */
public class Increaser implements Runnable{

        private Counter c;
        private Object obj;

        public Increaser(Counter counter){
            this.c=counter;
            obj=new Object();
        }

    public static void main(String [] args){

        Counter counter=new Counter();
        for(int i=0; i<100; i++){
        Increaser increaserTask=new Increaser(counter);
        Thread t=new Thread(increaserTask);
        t.start();
        }
    }

        @Override
        public void run() {
            System.out.println("Starting at: "+ c.getCount());
            for(int i=0; i<1000;i++){
                c.increase();
            }
            System.out.println("Stopping at: "+c.getCount());

            }
        }



