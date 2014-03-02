package ConcurrencyBookExercise;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 02/03/14
 * Time: 21:22
 * To change this template use File | Settings | File Templates.
 */
public class ResponsiveUI extends Thread {

    private static volatile  double d=1;

    public ResponsiveUI(){
        setDaemon(true);
        start();
    }
    public void run(){
        while(true){
            d=d+(Math.PI+ Math.E)/d;
        }
    }

    public static void main(String [] args) throws Exception{
        new ResponsiveUI(); //allows for this to run in the background    
        System.in.read();
        System.out.println(d); //Shows progress
    }
}
