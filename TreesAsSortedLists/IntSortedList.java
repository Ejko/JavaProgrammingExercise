package TreesAsSortedLists;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 30/11/13
 * Time: 22:43
 * To change this template use File | Settings | File Templates.
 */

/**
 * Interface used for implementation of sorted lists
 */

public interface IntSortedList {

    /**
     * Adds a new int to the list so that the list remains sorted; a list can contain duplicate values
     */
    void add(int n);

    /**
     * returns true if the number is on the list, false otherwise
     */
    boolean contains(int n);

    /**
     * returns a string with the values of hte elements in the list, separated by commas
     */
    String toStr();
}
