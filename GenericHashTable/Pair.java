package GenericHashTable;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 17/12/13
 * Time: 21:59
 * To change this template use File | Settings | File Templates.
 */
public class Pair<K,V> {
    private K key;
    private V value;

    public Pair(K key, V value){
        this.key=key;
        this.value=value;
    }

    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }

    public void setKey(K key){
        this.key=key;
    }

    public void setValue(V value){
        this.value=value;
    }
}

