package SortingAlgorithms;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 26/01/14
 * Time: 16:35
 * To change this template use File | Settings | File Templates.
 */

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Before.*;

import java.util.List;
import java.util.ArrayList;


public class QuickSortTest {

    @Test
    public void testOne(){

        List<Integer> expected=new  ArrayList<Integer>();
        expected.add(17);

        List<Integer> testList = new ArrayList<Integer>();
        testList.add(17);

        QuickSort.quickSort(testList);

        assertEquals(expected, testList);
    }

    @Test
    public void testTwo(){

        List<Integer> expected=new  ArrayList<Integer>();
        expected.add(1);
        expected.add(2);

        List<Integer> testList = new ArrayList<Integer>();
        testList.add(2);
        testList.add(1);

        QuickSort.quickSort(testList);

        assertEquals(expected, testList);
    }

    @Test
    public void testThree(){

        List<Integer> expected=new  ArrayList<Integer>();
        expected.add(2);
        expected.add(5);
        expected.add(7);

        List<Integer> testList = new ArrayList<Integer>();
        testList.add(7);
        testList.add(2);
        testList.add(5);

        QuickSort.quickSort(testList);

        assertEquals(expected, testList);
    }

    @Test
    public void testFour(){

        List<Integer> expected=new  ArrayList<Integer>();
        expected.add(2);
        expected.add(5);
        expected.add(7);
        expected.add(11);

        List<Integer> testList = new ArrayList<Integer>();
        testList.add(7);
        testList.add(5);
        testList.add(2);
        testList.add(11);

        QuickSort.quickSort(testList);

        assertEquals(expected, testList);
    }

    @Test
    public void quickSortStandardTest(){

        List<Integer> expected=new  ArrayList<Integer>();
        expected.add(17);
        expected.add(24);
        expected.add(31);
        expected.add(45);
        expected.add(50);
        expected.add(63);
        expected.add(85);
        expected.add(96);

        List<Integer> testList=new ArrayList<Integer>();
        testList.add(85);
        testList.add(24);
        testList.add(63);
        testList.add(45);
        testList.add(17);
        testList.add(50);
        testList.add(31);
        testList.add(96);

       QuickSort.quickSort(testList);

        assertEquals(expected, testList);
    }
    @Test
    public void quickSortDuplicatePivotTest(){
        List<Integer> expected=new  ArrayList<Integer>();
        expected.add(17);
        expected.add(24);
        expected.add(31);
        expected.add(45);
        expected.add(50);
        expected.add(50);
        expected.add(63);
        expected.add(85);
        expected.add(96);
        expected.add(96);

        List<Integer> testList=new ArrayList<Integer>();
        testList.add(85);
        testList.add(24);
        testList.add(63);
        testList.add(45);
        testList.add(96);
        testList.add(50);
        testList.add(17);
        testList.add(50);
        testList.add(31);
        testList.add(96);


       QuickSort.quickSort(testList);

        assertEquals(expected, testList);
    }

    @Test
    public void quickSortEmptyListTest(){
        List<Integer> expected=new  ArrayList<Integer>();
        List<Integer> testList=new ArrayList<Integer>();
        QuickSort.quickSort(testList);

        assertEquals(expected, testList);
    }

    @Test
    public void startingwithSmallTest(){
        List<Integer> expected=new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(8);

        List<Integer> actual=new ArrayList<Integer>();
        actual.add(1);
        actual.add(8);
        actual.add(2);
        actual.add(3);

        QuickSort.quickSort(actual);

        assertEquals(expected, actual);

    }
}
