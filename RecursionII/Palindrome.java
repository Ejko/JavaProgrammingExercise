package RecursionII;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 25/01/14
 * Time: 12:40
 * To change this template use File | Settings | File Templates.
 */
public class Palindrome {

    public String reversal(String word){
        if(word.length()<=1){
            return word;
        }
        else{
            String result= reversal(word.substring(1)) + word.charAt(0);
            return result;
        }
    }

    public boolean Palindrome(String word){
        return word.equals(reversal(word));
    }

    public static void main(String [] args){

        Palindrome my=new Palindrome();
        System.out.println(my.Palindrome("mama"));
    }
}
