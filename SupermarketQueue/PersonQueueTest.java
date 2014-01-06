package SupermarketQueue;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 06/01/14
 * Time: 18:26
 * To change this template use File | Settings | File Templates.
 */

import org.junit.*;
import static org.junit.Assert.*;

public class PersonQueueTest {

    PersonQueue testQueue;

    @Before
    public void QueueGenerator(){

       testQueue=new PersonQueueImpl();
    }
    @Test
    public void insertItemAtBeginningTest(){

        Person person1=new Person("Jimmy", 25);
        testQueue.insert(person1);

        String expected="Jimmy";
        String result=person1.getName();

        assertEquals(expected, result);
    }

    @Test
    public void insertMultipleItems(){

        Person person1=new Person("Petra", 23);
        testQueue.insert(person1);
        Person person2=new Person("Simon", 45);
        testQueue.insert(person2);
        Person person3=new Person("Lenny", 56);
        testQueue.insert(person3);

        String expected1="Petra";
        String expected2="Simon";
        String expected3="Lenny";

        assertEquals(expected1, testQueue.viewPerson(person1));
        assertEquals(expected2, testQueue.viewPerson(person2));
        assertEquals(expected3, testQueue.viewPerson(person3));
    }

    @Test
    public void retrieveItem(){
        Person person1=new Person("Petra", 23);
        testQueue.insert(person1);
        Person person2=new Person("Simon", 45);
        testQueue.insert(person2);
        Person person3=new Person("Lenny", 56);
        testQueue.insert(person3);

        String expected="Petra";
        String result=testQueue.retrieve().getName();

        assertEquals(expected,result);
    }
    @Test
    public void retrievefromEmptyList(){

        Person expected=null;
        Person result=testQueue.retrieve();

        assertEquals(expected, result);
    }



}
