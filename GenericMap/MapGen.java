package GenericMap;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 15/12/13
 * Time: 21:30
 * To change this template use File | Settings | File Templates.
 */
public class MapGen {

    public static void main(String [] args){

        MapGen randomMap=new MapGen();
        randomMap.launch();
    }

    public void launch(){
        /**
         * Generates a map with both keys and values as Strings
         * Then uses all methods of the class
         */
        GenericMap<String, String> fruitMap=new GenericMapImpl<String, String>(String.class);

        fruitMap.put("a", "apple");
        fruitMap.put("t", "tomato");
        fruitMap.put("p", "pineapple");
        fruitMap.put("b", "banana");

        fruitMap.get("b");
        fruitMap.get("t");
        fruitMap.get("a");
        fruitMap.get("p");

        fruitMap.remove("t");
        fruitMap.get("t");

        fruitMap.remove("a");
        fruitMap.remove("b");
        fruitMap.remove("p");
        System.out.println(fruitMap.isEmpty());

        /**
         * Generates a map with integers as keys and strings as values
         */

        GenericMap<Integer, String> employeeID=new GenericMapImpl<Integer, String>(String.class);

        employeeID.put(11, "Vlad");
        employeeID.put(15, "Liliya");

        employeeID.get(11);
        employeeID.get(15);


    }
}
