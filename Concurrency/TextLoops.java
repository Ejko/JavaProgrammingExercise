package Concurrency;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 10/02/14
 * Time: 18:42
 * To change this template use File | Settings | File Templates.
 */
public class TextLoops implements Runnable {
    private static final int COUNT=10;

    private final String name;

    public TextLoops(String name){
        this.name=name;
    }

    @Override
    public void run() {
        for(int i=0; i<COUNT; i++){
            System.out.println("Loop: "+name+ ", Iteration: "+ i);
        }
    }

    public static void main(String [] args){
        if(args.length<1||(!args[0].equals("0")&&!args[1].equals("1"))){
            System.out.println("USAGE: java TextLoop <mode>");
            System.out.println("    mode 0: without threads");
            System.out.println("    mode 1: with threads");
        }
        else if(args[0].equals("0")){
            for(int i=0; i<10; i++){
                Runnable r= new TextLoops(" Thread: "+i);
                r.run();
            }
        }
            else{
                for(int i=0; i<10;i++){
                    Runnable r=new TextLoops("Thread "+i);
                    Thread t=new Thread(r);
                    t.start();
            }

        }
    }
}
