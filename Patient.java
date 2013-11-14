/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 11/11/13
 * Time: 19:08
 * To change this template use File | Settings | File Templates.
 */
public class Patient {
    private String name;
    private int age;
    private String illness;
    //this variable stores a pointer to the next element in the linked list
    private Patient nextPatient;

    public Patient(String name, int age, String illness){
        this.name=name;
        this.age=age;
        this.illness=illness;
        //the pointer to the next patient object in the linked list is initialized to null
        this.nextPatient=null;
    }

    public void addPatient(Patient newPatient){
        if(this.nextPatient==null){
            //this means the patient is the last one on the list-we are safe to add-no more after
            this.nextPatient=newPatient;
            //this means that the next patient added after the current one will be the new patient in the parameter
            //we do not care about the current element
        }
        else{
            //if we the next pointer was not null, that means the current element is not the last one on this list
            //therefore we call the method on nextPatient(which is the pointer to the next element) again, to try and
            //find if the pointer of its next element points to null, until we find one that does
            this.nextPatient.addPatient(newPatient);
        }
    }

    public boolean deletePatient(Patient patientToDelete){
        if(this.nextPatient==null){
            //if the next element is null, that means you have reached the end of the list and not found the element-false
            return false;
        }
        else if(this.nextPatient.name.equals(patientToDelete.name)){
            //if the reference to the next element points the an object that the property name of is the same as the one
            //of the entered patient, then we have found it-it is the next patient
            this.nextPatient=nextPatient.nextPatient;
                    //what happens here is that the pointer to the next patient is re-routed to the pointer of the patient
                    //after the next one, as the next one will be left unlinked and collected by the garbage collector
            return true;
            }
        else{
           return  this.nextPatient.deletePatient(patientToDelete);
            //otherwise move on and check the next element and its pointer
        }
    }
    //method to return the pointer to the next element
    public Patient getNext(){
        return nextPatient;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    public String getIllness(){
        return illness;
    }

    public void Print(){

    System.out.println("Patient: "+ this.getName());
    System.out.println("Age: "+ this.getAge());
    System.out.println("Illness: "+ this.getIllness());
       }

}
