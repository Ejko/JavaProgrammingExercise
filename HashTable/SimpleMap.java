package HashTable;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 18/11/13
 * Time: 18:29
 * To change this template use File | Settings | File Templates.
 */

/**
 * Map from integer to strings
 */
public interface SimpleMap {
    /**
     * Puts a new string into the map
     * If the key is already in the map, nothing is done
      */
    void put(int key, String name);

    /**
     * Returns all the names associated with that key
     * or null if there is none
     */
    MapNode get(int key);

    /**
     * Removes a name from the map
     * Future calls to get(key) will return null unless
     * another name is added with the same key
     */
    void remove(int key);

    /**
     *  returns true if there are no workers in the map
     * false otherwise
     */
    boolean isEmpty();
}
