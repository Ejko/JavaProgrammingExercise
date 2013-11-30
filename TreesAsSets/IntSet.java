package TreesAsSets;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 30/11/13
 * Time: 12:41
 * To change this template use File | Settings | File Templates.
 */

/**
 * Interface to implement trees as sets, meaning they contain no duplicates
 */
public interface IntSet {

    /**
     * Adds a new integer to the set, if there is one already, does nothing
     */
    void add(int n);

    /**
     * Accepts an integer, returns true if the number is in the set, false if not
     */
    boolean contains(int n);

    /**
     * returns true if the number is present in the set and false if it's not, but
     * prints every number is checks on the screen
     */
    boolean containsVerbose(int n);

    /**
     * Returns a string with the value of the elements in the set, separated by commas
     */
    String toStr();


}
