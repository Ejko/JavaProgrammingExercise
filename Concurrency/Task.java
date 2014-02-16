package Concurrency;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 10/02/14
 * Time: 22:29
 * To change this template use File | Settings | File Templates.
 */
public class Task implements Runnable {

    private final int taskDuration;
    private final int taskID;

    public Task(int time, int id){
        this.taskDuration=time;
        this.taskID=id;
    }

    @Override
    public void run() {
       try{
            Thread.sleep(taskDuration);
          }
       catch(InterruptedException ex){
            //nothing to do
          }
       System.out.println("Finished task: "+taskID);


    }
}
