package SinglyLinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 11/11/13
 * Time: 19:11
 * To change this template use File | Settings | File Templates.
 */
public class HospitalManager {
    //this is the element of type SinglyLinkedList.Patient where the linked list starts; initialized to null
    private Patient patientListStart=null;

    public static void main(String [] args){
        //the only purpose this class servers is to set the first element of the list and for main method
        HospitalManager hm=new HospitalManager();
        hm.launch();
    }

    public void launch(){
        Patient firstPatient=new Patient("John Smith", 56, "heart attack");
        patientListStart=firstPatient;
        Patient secondPatient=new Patient("Sarah Creaton", 23, "bronchitis");
        patientListStart.addPatient(secondPatient);
        Patient thirdPatient=new Patient("Harry Jones", 45, "broken leg");
        patientListStart.addPatient(thirdPatient);
        Patient fourthPatient=new Patient("Gemma Johnston", 67, "meningitus");
        patientListStart.addPatient(fourthPatient);
        Patient fifthPatient=new Patient("Francisco D'Anconia", 34, "broken heart");
        patientListStart.addPatient(fifthPatient);
        Patient sixthPatient=new Patient("John Galt", 36, "ambition");
        patientListStart.addPatient(sixthPatient);
        Patient seventhPatient=new Patient("Dagny Taggart", 30, "perfection");
        patientListStart.addPatient(seventhPatient);
        removeFirstElement();
        prettyPrint();
        System.out.println("Total number of patients is: "+listLength());

    }

    public void prettyPrint(){
        Patient currentPatient=patientListStart;
        while(currentPatient!=null){
            currentPatient.Print();
            currentPatient=currentPatient.getNext();
        }
        System.out.println();
    }

    public int listLength(){
       int counter=0;
       Patient countNext=patientListStart;
       while(countNext!=null){
            countNext=countNext.getNext();
            counter++;
        }
       return counter;

    }

    public void removeFirstElement(){       //a special separate method is required to take care of the first element removal
        patientListStart=patientListStart.getNext();

    }

 }



