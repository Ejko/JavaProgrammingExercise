package SimpleMap;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 18/11/13
 * Time: 18:34
 * To change this template use File | Settings | File Templates.
 */

/**
 * Implementation of a simple map using integers as keys
 * This implementation uses an array for the names
 * The keys will be the indexes of the array
 * Either the user should be limited to entering keys in the range of the array length or
 * the array should be implemented as a growing array
 */
public class SimpleMapImp implements SimpleMap {

    private String [] mapNodes;

    public SimpleMapImp(){
        mapNodes=new String[10];

    }

    @Override
    public void put(int key, String name) {
           if(key>mapNodes.length||key<0){
               System.out.println("Invalid key, entry not accepted");
               return;
           }
         else if (mapNodes[key]!=null){
                return;
            }
        else{
               mapNodes[key]=name;
           }
       System.out.println(mapNodes[key]);
    }

    @Override
    public String get(int key) {
        if(mapNodes[key]!=null){
            return mapNodes[key];
        }
        else return null;

    }

    @Override
    public void remove(int key) {
        if(mapNodes[key]!=null){
            mapNodes[key]=null;
        }

    }

    @Override
    public boolean isEmpty() {
        boolean isEmpty=true;
        for(int i=0; i<mapNodes.length;i++){
            if(isEmpty&&mapNodes[i]!=null){
            isEmpty=false;
            }
        }
        return isEmpty;
    }

    public static void main(String [] args){

        SimpleMap map=new SimpleMapImp();
        map.put(1, "Joe");
        map.put(2, "Jane");
        map.put(3, "Ran");
        map.put(4, "Danny");
        map.put(12, "Sammy");

       System.out.println("Element: "+map.get(3));
       System.out.println(map.isEmpty());

        /*map.remove(1);
        map.remove(2);
        map.remove(3);
        map.remove(4);

        System.out.println("Element is: "+map.get(1));
        System.out.println(map.isEmpty());
        */
    }


}
