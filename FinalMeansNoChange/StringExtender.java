package FinalMeansNoChange;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 02/12/13
 * Time: 20:43
 * To change this template use File | Settings | File Templates.
 */
public class StringExtender /*extends String*/ {
    //An example that string is a final class and cannot be extended from
    public void printEven(String text){
        int n=0;
        while(n<text.length()){
            System.out.println(text.charAt(2*n));
        }
    }

    public static void main(String [] args){
        StringExtender str=new StringExtender();
        str.printEven("mama");
    }
}

