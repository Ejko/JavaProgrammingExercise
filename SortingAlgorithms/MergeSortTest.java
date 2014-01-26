package SortingAlgorithms;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 26/01/14
 * Time: 01:22
 * To change this template use File | Settings | File Templates.
 */

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Before.*;

import java.util.ArrayList;
import java.util.List;


public class MergeSortTest {

    List<Integer> testList;

    @Before
    public void objCreator() {
        testList = new ArrayList<Integer>();
    }

    @Test
    public void sortTest() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(7);
        expected.add(9);

        testList.add(9);
        testList.add(3);
        testList.add(1);
        testList.add(7);
        testList.add(2);
        List<Integer> result = MergeSort.sort(testList);

        assertEquals(expected, result);


    }


}
