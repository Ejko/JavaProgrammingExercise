package DoubleLinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 12/01/14
 * Time: 22:47
 * To change this template use File | Settings | File Templates.
 */

/**
 * JUnit test for double linked list representing patients in a hospital
 */
import org.junit.*;
import static org.junit.Assert.*;


public class DoubleLinkedListTest {

    DoubleHospitalManager dhm;

    /**
     * Creating a linked list object
     */
    @Before
    public void hospitalManagerCreator(){

       dhm=new DoubleHospitalManager();
    }

    /**
     * Adding a new patient to the beginning of the list
     */
    @Test
    public void addPatientAtBeginningTest(){

        DoublePatient patientHead=new DoublePatient("Mario", 12, "cough");
        dhm.setListHead(patientHead);
        String expected="Mario";
        String result=dhm.getListHead().getName();
        assertEquals(expected, result);

    }

    /**
     * Adding a new patient to the end of the list
     */
    @Test
    public void addPatientAtEndTest(){

        DoublePatient pat1=new DoublePatient("Sam", 40, "high blood pressure");
        dhm.setListHead(pat1);
        DoublePatient pat2=new DoublePatient("Jimmy", 34, "broken leg");
        dhm.getListHead().addPatient(pat2);
        DoublePatient pat3=new DoublePatient("Lauren", 37, "headache");
        dhm.getListHead().addPatient(pat3);

        String expectedName="Lauren";
        String resultName=dhm.getListHead().searchPatient(pat3);
        assertEquals(expectedName, resultName);
    }

    /**
     * removing first record from list
     */
    @Test
    public void removeFirstPatient(){
        DoublePatient pat1=new DoublePatient("Sam", 40, "high blood pressure");
        dhm.setListHead(pat1);
        DoublePatient pat2=new DoublePatient("Jimmy", 34, "broken leg");
        dhm.getListHead().addPatient(pat2);
        DoublePatient pat3=new DoublePatient("Lauren", 37, "headache");
        dhm.getListHead().addPatient(pat3);

        dhm.deleteListHead();
        DoublePatient expectedHead=pat2;
        DoublePatient actualHead=dhm.getListHead();

        assertEquals(expectedHead, actualHead);


    }

    /**
     * removing last record from the list
     */
    @Test
    public void removeLastPatient(){
        DoublePatient pat1=new DoublePatient("Sam", 40, "high blood pressure");
        dhm.setListHead(pat1);
        DoublePatient pat2=new DoublePatient("Jimmy", 34, "broken leg");
        dhm.getListHead().addPatient(pat2);
        DoublePatient pat3=new DoublePatient("Lauren", 37, "headache");
        dhm.getListHead().addPatient(pat3);

        dhm.getListHead().deletePatient(pat3);

        assertTrue(pat2.getNext()==null);
    }
    /**
     * Removing list from a position other than first or last
     */
    @Test
    public void removePatient(){
        DoublePatient pat1=new DoublePatient("Sam", 40, "high blood pressure");
        dhm.setListHead(pat1);
        DoublePatient pat2=new DoublePatient("Jimmy", 34, "broken leg");
        dhm.getListHead().addPatient(pat2);
        DoublePatient pat3=new DoublePatient("Lauren", 37, "headache");
        dhm.getListHead().addPatient(pat3);
        DoublePatient pat4=new DoublePatient("Jon", 30, "bruises");
        dhm.getListHead().addPatient(pat4);

        dhm.getListHead().deletePatient(pat2);

        DoublePatient expectedResult=pat3;
        DoublePatient actualResult=dhm.getListHead().getNext();

        assertEquals(expectedResult, actualResult);

    }
    /**
     * Adding a first element then deleting it then adding another one
     */
    @Test
    public void addRemoveReplaceHeadTest(){
        DoublePatient pat1=new DoublePatient("Sam", 40, "high blood pressure");
        dhm.setListHead(pat1);
        dhm.deleteListHead();

        DoublePatient pat2=new DoublePatient("Jimmy", 34, "broken leg");
        dhm.setListHead(pat2);

        assertTrue(dhm.getListHead().getName().equals("Jimmy"));

    }

    /**
     * Testing patient name output to string
     */
    @Test
    public void toStringTest(){
        DoublePatient pat1=new DoublePatient("Sam", 40, "high blood pressure");
        dhm.setListHead(pat1);

        String expected="Sam";
        String result=dhm.getListHead().toString();

        assertEquals(expected, result);

    }
}
