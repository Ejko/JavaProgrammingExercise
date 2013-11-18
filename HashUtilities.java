/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 18/11/13
 * Time: 18:14
 * To change this template use File | Settings | File Templates.
 */
public class HashUtilities {

     static int  shortHash(int n){
        int hash=Math.abs(n%1000);
         return hash;
    }

    public static void main(String [] args){
        System.out.println("Give me a string and I will calculate its hash code: ");
        String str=System.console().readLine();
        int hash=str.hashCode();
        int smallHash=HashUtilities.shortHash(hash);
        System.out.println("0< "+smallHash+ " <1000");
       // System.out.println(HashUtilities.shortHash(hash));
      //  System.out.println(HashUtilities.shortHash(1986715906));
    }
}
