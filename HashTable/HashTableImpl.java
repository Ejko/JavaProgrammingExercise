package HashTable;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 24/11/13
 * Time: 23:16
 * To change this template use File | Settings | File Templates.
 */
public class HashTableImpl implements SimpleMap {

    private MapNode [] hashArray;

    @Override
    public void put(int key, String name) {
        MapNode first=null;
        for(int i=0; i<hashArray.length;i++){
            if(key==i){
                if(hashArray[i]==null){
                    //hashArray[i]=new
                }

            }
        }
    }

    @Override
    public MapNode get(int key) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void remove(int key) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isEmpty() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
