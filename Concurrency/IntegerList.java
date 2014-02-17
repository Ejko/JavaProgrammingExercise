package Concurrency;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 16/02/14
 * Time: 12:19
 * To change this template use File | Settings | File Templates.
 */
import java.util.List;
import java.util.ArrayList;

public class IntegerList {

    private List<Integer> list;

    private boolean sorted;

    private boolean running;

    public IntegerList(){

        this.list=new ArrayList<Integer>();
        Thread newThread=new Thread(new IntegerSorter());
        newThread.start();
        running=true;
    }

   public void add(Integer i){
       list.add(i);
       sorted=false;
   }

   public synchronized int get(int i){
       int item=0;
       while(!sorted){
           //System.out.print("...");

       }
       item=list.get(i);
       return item;
       }

   public void toString2(){
       for(Integer curr:list){
           System.out.print(curr+", ");
       }
       System.out.println();
   }

    private void sort_method() {

        boolean swap=true;
        int temp;

        if(!sorted){
            while(swap){
                swap=false;
                for(int i=0; i<list.size()-1; i++){
                    if(list.get(i)>list.get(i+1)){
                        temp=list.get(i);
                        list.set(i, list.get(i+1));
                        list.set(i+1,temp);
                        swap=true;
                    }
                }
            }
            sorted=true;
            }
    }

    private void stop(){
        this.running=false;
    }

   private class IntegerSorter implements Runnable{
        @Override
        public void run() {
              synchronized (this){
              while(running){
                sort_method();
              }
            }
        }
   }
    public static void main(String [] args){

        IntegerList intList=new IntegerList();
        intList.add(6);
        intList.add(2);
        intList.add(5);
        intList.add(9);
        intList.toString2();
        System.out.println(intList.get(3));

        intList.add(3);
        intList.add(11);


        intList.toString2();
        System.out.println(intList.get(3));
        intList.stop();

    }

}
