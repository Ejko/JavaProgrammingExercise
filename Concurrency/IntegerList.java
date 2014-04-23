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

    public IntegerList() {

        this.list = new ArrayList<Integer>();
        Thread newThread = new Thread(new IntegerSorter());
        newThread.start();
        running = true;
    }

    public void add(Integer i) {
        list.add(i);
        sorted = false;
    }

    public int get(int i) {
        //the get method will wait until list is sorted before returning
        int item = 0;
        while (!sorted) {
            //wait
        }
        item = list.get(i);
        return item;
    }

    public void prettyPrint() {
        for (Integer curr : list) {
            System.out.print(curr + ", ");
        }
        System.out.println();
    }

    private void sort_method() {

        if (!sorted) {
            bubbleSort(list);
        }
        sorted = true;
    }

    private void stop() {
        this.running = false;
    }

    private void bubbleSort(List<Integer> list) {
        boolean swap = true;
        int temp;
        while (swap) {
            swap = false;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    swap = true;
                }
            }
        }
    }

    //embedded class which implements the Runnable object that calls the sort method
    private class IntegerSorter implements Runnable {
        @Override
        public void run() {
            while (running) {
                sort_method();
            }
        }
    }

    public static void main(String[] args) {

        IntegerList intList = new IntegerList();
        intList.add(6);
        intList.add(2);
        intList.add(5);
        intList.add(9);
        intList.prettyPrint();
        System.out.println(intList.get(3));

        intList.add(3);
        intList.add(11);


        intList.prettyPrint();
        System.out.println(intList.get(3));
        intList.stop();

    }

}
