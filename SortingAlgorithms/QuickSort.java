package SortingAlgorithms;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 26/01/14
 * Time: 16:35
 * To change this template use File | Settings | File Templates.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.List.*;

public class QuickSort {

    public static <T extends Comparable<T>> void  quickSort(List<T> newList){

        if(newList.size()<=1){
            return;
        }
        sortUtil(newList,0, newList.size()-1);


    }

    public static <T extends Comparable<T>> void sortUtil(List<T> list, int leftEnd, int rightEnd){

        if(leftEnd>rightEnd){
           return;   //no elements in the list
        }
        int l=leftEnd;          //will be used to scan forward
        int r=rightEnd-1;       //will be used to scan backward
        T p=list.get(rightEnd);  //last number selected as pivot
        while(l<=r){
            while(l<=r&&list.get(l).compareTo(p)<0){
                l++;
            }
            if(l<r){
                swap(l, r, list);
            }
            while(r>=l&&list.get(r).compareTo(p)>=0){
                r--;
            }
            if(l<r){
                swap(l, r, list);
            }
        }

        swap(l, rightEnd, list);

        sortUtil(list,leftEnd, l-1);
        sortUtil(list, l+1,rightEnd);

    }

    public static <T> void swap(int a, int b, List<T> list) {
        T temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }

    public static void main(String [] args){

        List<Integer> test=new ArrayList<Integer>();
        test.add(7);
        test.add(5);
        test.add(2);
        test.add(11);

        quickSort(test);

        System.out.println(test.toString());

    }
}
