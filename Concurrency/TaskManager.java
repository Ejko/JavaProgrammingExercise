package Concurrency;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 10/02/14
 * Time: 21:19
 * To change this template use File | Settings | File Templates.
 */

public class TaskManager  {

    public static void main(String [] args){

        for(int i=0; i<10; i++){
            System.out.print("Enter the duration (in ms) of task " + i + ": ");
            int input=Integer.parseInt(System.console().readLine());
            Task task=new Task(input, i);
            Thread newThread=new Thread(task, "task - "+ i);
            newThread.start();
        }
    }


    }
