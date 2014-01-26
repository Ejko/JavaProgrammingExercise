package SupermarketQueue;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 17/11/13
 * Time: 22:04
 * To change this template use File | Settings | File Templates.
 */
public class PersonQueueImpl implements PersonQueue {

    private Person start;
    private Person end;

    @Override
    public void insert(Person person) {
        if(end==null){
            start=person;
            end=person;
        }
        else {
        end.setNext(person);
        end=person;
         }
    }

    @Override
    public Person retrieve() {
        Person p=start;
        if(start==null){
            return null;
        }
        start=start.getNext();
        return p;
    }

    @Override
    public String viewPerson(Person person){

        return person.getName();
    }
    public static void main(String [] args){

        PersonQueue q=new PersonQueueImpl();

        Person person1=new Person("Johny", 5);
        Person person2=new Person("Betty", 20);
        Person person3=new Person("Sammy", 10);
        q.insert(person1);
        q.insert(person2);
        q.insert(person3);

        if(q.retrieve()==person1){
            System.out.println("The first person removed was: "+person1);
        }
        if(q.retrieve()==person2){
            System.out.println("The 2nd person removed was: "+person2);
        }
        if(q.retrieve()==person3){
            System.out.println("The 3ed person removed was: "+person3);
        }
        q.retrieve();
        q.retrieve();

    }
}
