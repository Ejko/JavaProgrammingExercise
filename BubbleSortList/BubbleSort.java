package BubbleSortList;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 23/11/13
 * Time: 11:18
 * To change this template use File | Settings | File Templates.
 */

/**
 * Used for implementation of a list which is sorted using
 * the bubble sort algorithm
 */

public interface BubbleSort {

    //Adds a node to the list which is to be sorted
    void addToList(ListNode l);

    //Deletes a node from the list which is to be sorted
    //void deleteFromList(int n);

    //sorts the list elements using bubble sort
    void sortList();

}

