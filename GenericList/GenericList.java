package GenericList;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 14/12/13
 * Time: 17:51
 * To change this template use File | Settings | File Templates.
 */
public interface GenericList<T> {
    /**
     * Adds a new element to the list
     * @param value  the object to add to the list
     */
    void add(T value);

    /**
     * Removes an element from the list
     * Returns true if removed
     * @param value which is the value specified for deletion
     * @return true or false depending on whether the specified element was removed or not
     */
    void remove(T value);

    /**
     * Prints a list of all elements in the list
     */
    void printList();

}
