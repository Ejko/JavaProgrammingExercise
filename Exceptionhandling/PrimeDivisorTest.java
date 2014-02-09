package Exceptionhandling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 09/02/14
 * Time: 15:06
 * To change this template use File | Settings | File Templates.
 */
public class PrimeDivisorTest {

    /**
     * Test if numbers are added to the list as expected
     */
    @Test
    public void addPrimeTest(){

        List<Integer> expected= Arrays.asList(11,19,23);
        Integer input1=11;
        Integer input2=19;
        Integer input3=23;

       PrimeDivisorList pdt=new PrimeDivisorListImpl();
        pdt.addPrime(input1);
        pdt.addPrime(input2);
        pdt.addPrime(input3);

        assertEquals(expected, pdt.getPrimeDivisorList());
    }

    /**
     * Tests if a null pointer exception is thrown when a null integer is entered
     */
    @Test(expected=NullPointerException.class)
    public void NullPointerExceptionsIsThrownTest(){
        PrimeDivisorList pdt=new PrimeDivisorListImpl();
        Integer input=null;
        pdt.addPrime(input);

    }

    /**
     * Tests if an illegal argument exception is thrown if the number is not a prime
     */
    @Test(expected =IllegalArgumentException.class)
    public void IllegalArgumentExceptionIsThrownTest(){
        PrimeDivisorList pdt=new PrimeDivisorListImpl();
        Integer input=12;
        pdt.addPrime(input);
    }

    /**
     * Tests if a number is successfully removed from the list
     */
    @Test
    public void removePrimeTest(){
        List<Integer> expected= Arrays.asList(3,7);
        Integer input1=2;
        Integer input2=3;
        Integer input3=7;

        PrimeDivisorList pdt=new PrimeDivisorListImpl();
        pdt.addPrime(input1);
        pdt.addPrime(input2);
        pdt.addPrime(input3);
        pdt.removePrime(input1);

        assertEquals(expected, pdt.getPrimeDivisorList());
    }

    /**
     * Tests if toString returns the number correctly
     */
    @Test
    public void toStringOverrideTest(){
        Integer input1=5;
        Integer input2=3;
        Integer input3=7;

        PrimeDivisorList pdt=new PrimeDivisorListImpl();
        pdt.addPrime(input1);
        pdt.addPrime(input2);
        pdt.addPrime(input3);
        assertEquals("[3 * 5 * 7 = 105]", pdt.toString());
    }

    /**
     * Testing for the special case of toString with duplicate nums in the string
     */
    @Test
    public void toStringOverrideDuplicateNumsTest(){
        Integer input1=5;
        Integer input2=3;
        Integer input3=7;
        Integer input4=7;

        PrimeDivisorList pdt=new PrimeDivisorListImpl();
        pdt.addPrime(input1);
        pdt.addPrime(input2);
        pdt.addPrime(input3);
        pdt.addPrime(input4);
        assertEquals("[3 * 5 * 7 ^ 2 = 735]", pdt.toString());
    }

}
