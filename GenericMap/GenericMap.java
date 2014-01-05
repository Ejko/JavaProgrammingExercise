package GenericMap;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 15/12/13
 * Time: 20:47
 * To change this template use File | Settings | File Templates.
 */

/**
 * This is a simple map interface with generic class type
 * A map is a dynamic data structure used to represent data in a key, value pair format
 * This
 */
public interface GenericMap<K, V> {

    /**
     * Puts a new string into the map
     * The key and value can be of any type
     * If the key is already in the map, nothing is done
     */
    void put(K key, V value);

    /**
     * Returns the name associated with that key
     * or null if there is none
     */
    V get(K key);

    /**
     * Removes a name from the map
     * Future calls to get(key) will return null unless
     * another name is added with the same key
     */
    void remove(K key);

    /**
     *  returns true if there are no workers in the map
     * false otherwise
     */
    boolean isEmpty();
}


