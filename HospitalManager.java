/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 11/11/13
 * Time: 19:11
 * To change this template use File | Settings | File Templates.
 */
public class HospitalManager {
    //this is the element of type Patient where the linked list starts; initialized to null
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
        prettyPrint();
      //  patientListStart.deletePatient(thirdPatient);
        //in order to delete the first element of a linked list, you cannot delete it by using the method of looping
        //through the list. Instead, just point the start of the list to the next element in the list and the
        //unlinked element will be discarded
       // patientListStart=patientListStart.getNext();
       // prettyPrint();
        System.out.println("Total number of patients is: "+listLength());
        System.out.println("Total number of patients is: "+listLength1(firstPatient,0));

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
    //this one is not working recursively-need to look into it further
    public int listLength1(Patient nextCountedPatient, int counter){
           // int counter=0;
            if(nextCountedPatient==null){
              return counter;
        }
        else{
              listLength1(nextCountedPatient.getNext(),counter++);
                counter++;
                System.out.println("each iteration gives: "+counter);
        }

        return counter;

    }

}



