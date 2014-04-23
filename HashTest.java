/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 05/01/14
 * Time: 11:53
 * To change this template use File | Settings | File Templates.
 */

import org.junit.*;
import static org.junit.Assert.*;

public class HashTest {
    @Test

    public void testShortHash(){

        int i=0;
        while(i<200){
            double random=Math.random()*Integer.MAX_VALUE;
            int input=(int) random;
            int output=HashUtilities.shortHash(input);
            System.out.println("Number: "+random+ "|"+"Short hash: "+ output);

            assertTrue("Hash is negative. ", 0<=output);
            assertTrue("Hash is bigger than 1000",1000>output);
        i++;
        }
    }

    @Test
   public void testShortHashZero(){
        int input=0;
        int output=HashUtilities.shortHash(input);

        assertTrue("Hash is negative. ", 0<=output);
        assertTrue("Hash is bigger than 1000", 1000>output);


        System.out.println("Number: "+input+ "|"+"Short hash: "+ output);
    }

   public void testShortHashNegative(){

       int input=-500;
       int output=HashUtilities.shortHash(input);

       assertTrue("Hash is negative. ", 0<=output);
       assertTrue("Hash is bigger than 1000", 1000>output);

   }

}
