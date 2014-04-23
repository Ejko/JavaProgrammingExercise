package RecursionII;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 25/01/14
 * Time: 19:56
 * To change this template use File | Settings | File Templates.
 */
public class abcdeTest {
    public static void main(String [] args){
        stringRecurse("abcde");
    }

    public static void stringRecurse(String word){
        System.out.println(word);
        if(word.length()<2){
            System.out.println(word);
        }
        else{
            stringRecurse(word.substring(0, word.length()-1));
            System.out.println(word);
        }
    }
}

