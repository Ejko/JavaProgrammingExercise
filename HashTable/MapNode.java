package HashTable;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 24/11/13
 * Time: 23:12
 * To change this template use File | Settings | File Templates.
 */
public class MapNode {
    private String name;
    private MapNode next;

    public MapNode(String s){
        this.name=s;
        this.next=null;
    }
    public String getName(){
        return name;
    }
    public MapNode getNext(){
        return  next;
    }
    public void setName(String s){
        this.name=s;
    }
    public void setNext(MapNode m){
        this.next=m;
    }
}
