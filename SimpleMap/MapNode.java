package SimpleMap;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 18/11/13
 * Time: 18:38
 * To change this template use File | Settings | File Templates.
 */
public class MapNode {

    private int key;
    private String name;

    public MapNode(int key, String name){
        this.key=key;
        this.name=name;
    }

    public String getName(){
        return this.name;
    }
    public void setName( String name){
        this.name=name;
    }
    public int getKey(){
        return this.key;
    }
    public void setKey(int k){
        this.key=k;
    }
}
