package GenericHashTable;

import GenericList.GenericListImpl;

import java.lang.reflect.Array;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 17/12/13
 * Time: 21:27
 * To change this template use File | Settings | File Templates.
 */
public class HashTableImpl<K, V> implements GenericMap<K,V> {

    private GenericListImpl<Pair<K,V>> [] valuePairs;
    private  static final int DEFAULT_SIZE=1000;

    @SuppressWarnings("unchecked")
    public HashTableImpl(){
        valuePairs= (GenericListImpl <Pair<K,V>>[]) Array.newInstance(GenericListImpl.class, DEFAULT_SIZE);
    }
    @Override
    public void put(K key, V value) {
        int keyMap=getKeyMap(key);
        if(valuePairs[keyMap]==null){
        valuePairs[keyMap]=new GenericListImpl<Pair<K, V>>();
        valuePairs[keyMap].add(new Pair<K,V>(key, value));
        }
    }

    @Override
    public void get(K key) {
        int keyMap=getKeyMap(key);
        if(valuePairs[keyMap]!=null){
          //  while(valuePairs[keyMap])
           // valuePairs[keyMap].toString();
           System.out.println(valuePairs[keyMap].toString());

        }
    }

    @Override
    public void remove(K key) {
        int keyMap=getKeyMap(key);
        if(valuePairs[keyMap]!=null){
            valuePairs[keyMap]=null;
        }
    }

    @Override
    public boolean isEmpty() {
        boolean isEmpty=true;
        for(int i=0; i<valuePairs.length; i++){
            if(isEmpty&&valuePairs[i]!=null){
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
