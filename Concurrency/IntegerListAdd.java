package Concurrency;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 02/03/14
 * Time: 23:24
 * To change this template use File | Settings | File Templates.
 */
public class IntegerListAdd {

    private List<Integer> list;

    private boolean sorted;

    private boolean running;

    public IntegerListAdd(){
        this.list=new ArrayList<Integer>();
        running=true;
    }

    public void add(Integer newElement){
        if(newElement.compareTo(list.get(0))<0){
            list.add(0, newElement);
        }
        else{
            Thread newThread=new Thread();
            newThread.start();
        }

    }


    private class IntegerListAdder implements Runnable{

        @Override
        public void run() {
            //To change body of implemented methods use File | Settings | File Templates.
        }
    }

    private void addToList(Integer element, List<IntegerList> list){


    }


}
