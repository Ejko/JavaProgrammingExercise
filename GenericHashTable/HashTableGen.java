package GenericHashTable;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 17/12/13
 * Time: 22:54
 * To change this template use File | Settings | File Templates.
 */
public class HashTableGen {

    public static void main(String [] args){

        HashTableGen generator=new HashTableGen();
        generator.launch();
    }

    public void launch(){

        GenericMap<String, String> mapper=new HashTableImpl<String, String>();
        mapper.put("A", "apple");
        mapper.put("A", "august");
        mapper.put("A", "aubergine");
        mapper.put("C", "cockroach");

        mapper.get("A");
        mapper.remove("C");
    }
}
