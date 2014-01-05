package GenericMap;

import java.lang.reflect.Array;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 15/12/13
 * Time: 20:54
 * To change this template use File | Settings | File Templates.
 */

/**
 * This is an implementation of a simple map using generic types for keys and values
 * This implementation uses an array
 * @param <K>
 * @param <V>
 */
public class GenericMapImpl<K,V> implements GenericMap<K,V> {

    /**
     * The size of the array is set to a max of 1000
     */
    private  static final int DEFAULT_SIZE=1000;
    private V[] values;

    @SuppressWarnings("unchecked")
    /**
     * The array is initialized using the newInstance construct and then cast into array of type V
     */
    public GenericMapImpl(Class<V> type){
            values = (V[]) Array.newInstance(type, DEFAULT_SIZE);
    }
    @Override
    /**
     * The hash code function is used to convert the key of any type to an integer
     * The value is then inserted at the array index matching the hash code of the key
     */
    public void put(K key, V value) {
        int keyMap=getKeyMap(key);
        values[keyMap]=value;
    }

    @Override
    /**
     * If there is no value matching this key, null will be returned
     */
    public V get(K key) {
            int keyMap=getKeyMap(key);
            if(values[keyMap]!=null){
                System.out.println("Key "+ key+" maps to value: "+values[keyMap]);
                return values[keyMap];
            }
            else{
                System.out.println("No value matching key was found");
                return null;
            }

        }
    @Override
    /**
     * If there are no values matching the keys, null will be returned
     * Future calls to the key will return nulls, unless another value is added with the same key
     */
    public void remove(K key) {
            int keyMap=getKeyMap(key);
            if(values[keyMap]!=null){
                System.out.println("Value "+ values[keyMap]+ " removed");
                values[keyMap]=null;
            }
            else{
                System.out.println("Value does not exist");
            }
    }
    @Override
    public boolean isEmpty() {
        boolean isEmpty=true;
        for(int i=0; i<values.length;i++){
            if(isEmpty&&values[i]!=null){
                isEmpty=false;
            }
        }
        return isEmpty;
    }

    /**
     * Converts a hash code to a short hash
     * @param n
     * @return short hash code between 0 and 99
     */
    static int  shortHash(int n){
        int hash=Math.abs(n%1000);
        return hash;
    }
    /**
     * takes in a key and returns a short has code for it
     * @param key
     * @return short hash code
     */
    private int getKeyMap(K key){
        int hash=key.hashCode();
        return shortHash(hash);
    }
}
