package RecursionII;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 25/01/14
 * Time: 12:40
 * To change this template use File | Settings | File Templates.
 */
public class Palindrome {


    public String palindromeConvert(String str){
        if(str.length()==0){
            return "";
        }
        else if(str.length()==1){
            return str;
        }
        else{
            return str.substring(str.length()-1)+palindromeConvert(str.substring(0, str.length() - 1));
        }
    }

    public boolean isPalindrome(String str){

        if(palindromeConvert(str).equals(str)){
            return true;
        }

        else{

            return false;
        }

    }

    public static void main(String [] args){

        Palindrome paly=new Palindrome();
        System.out.println(paly.isPalindrome("madam"));
    }
}
