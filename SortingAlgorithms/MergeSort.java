package SortingAlgorithms;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 26/01/14
 * Time: 01:21
 * To change this template use File | Settings | File Templates.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList.*;

public class MergeSort {
    /**
     * recursive call for breaking down the list into two halves until a single element is returned
     * @param list that needs to be sorted
     * @param <T>  the type used to parametrize the method with
     * @return the sorted and merged list
     */
    public static <T extends Comparable<T>> List<T> sort(List<T> list){

        /**
         * Lists used to split the main list into two halves
         */
        List<T> leftPart;
        List<T> rightPart;

        if(list.size()<=1){
            return list;        //list is already sorted-return
        }
        else{
            //recursive call on each half of the list; it will be split until 1 elem remains in each half
            leftPart = sort(list.subList(0, list.size()/2));
            rightPart = sort(list.subList(list.size()/2, list.size()));
            //this is the merging action to combine two sorted lists together
            return merge(leftPart, rightPart);
        }
    }
    /**
     * This method acts to merge two pre-sorted lists into a single sorted list
     * @param leftPart is the first sorted list
     * @param rightPart is the second sorted list
     * @param <T> parametrizing the type returned, extends Comparable to allow for comparison between elements
     * @return the sorted merged list
     */
    public static <T extends Comparable<T>> List<T> merge(List<T> leftPart, List<T> rightPart){
        List<T> temp = new ArrayList<T>(leftPart.size() + rightPart.size());

        for (int leftIdx = 0, rightIdx = 0; leftIdx < leftPart.size() || rightIdx < rightPart.size(); ) {
            if (leftIdx == leftPart.size()) {
                // means no more left elements
                temp.add(rightPart.get(rightIdx));
                rightIdx++;
            } else if (rightIdx == rightPart.size()) {
                // means no more right elements
                temp.add(leftPart.get(leftIdx));       //copy all remaining left elements to the main list-already sorted
                leftIdx++;
            } else if(leftPart.get(leftIdx).compareTo(rightPart.get(rightIdx))<=0){
                // left is smaller than right
                temp.add(leftPart.get(leftIdx));    //copy left to main list
                leftIdx++;                          //move to next element in left
            } else {
                temp.add(rightPart.get(rightIdx));  //copy right to main list
                rightIdx++;
            }
        }
        return temp;
    }

    public static void main(String args[]){

        List<Integer> mergeSortList=new ArrayList<Integer>();
        mergeSortList.add(9);
        mergeSortList.add(3);
        mergeSortList.add(1);
        mergeSortList.add(7);
        mergeSortList.add(2);

        System.out.println(sort(mergeSortList).toString());

        }
}
