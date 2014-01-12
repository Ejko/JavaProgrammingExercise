package DoubleLinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 14/11/13
 * Time: 20:33
 * To change this template use File | Settings | File Templates.
 */

/**
 * Implementation of a double linked list using patient records as nodes
 * Add and remove methods in this version are in the node class(DoublePatient) as opposed to in the list class
 * Note: Not a very easy to test implementation; have had to introduce some additional methods to access data
 */

public class DoublePatient {
    /**
     * Patient attributes, includes reference to next and previous patient
     */
     private String name;
     private int age;
     private String illness;
     private DoublePatient nextPatient;
     private DoublePatient previousPatient;

     public DoublePatient(String name, int age, String illness){
        this.name=name;
        this.age=age;
        this.illness=illness;
        this.nextPatient=null;
        this.previousPatient=null;
     }

    /**
     * Adding a new patient to the list
     * Special cases: adding to an empty list
     * @param newPatient
     */
     public void addPatient(DoublePatient newPatient){
        if(this.nextPatient==null){
            this.nextPatient=newPatient;
            newPatient.previousPatient=this;
        }
        else{

            this.nextPatient.addPatient(newPatient);
         }
     }

    /**
     * Deleting a patient from a list
     * Special cases-not finding the required patient
     * @param patientToDelete
     * @return true is the patient is found and deleted; false if the patient is not found
     */

    public boolean deletePatient(DoublePatient patientToDelete){
        if(this.nextPatient==null){
             return false;
        }
        else if(this.nextPatient.name.equals(patientToDelete.name)){
            this.nextPatient=nextPatient.nextPatient;
            if(this.nextPatient!=null){

                this.nextPatient.previousPatient=this;

            }
            return true;
        }
        else{
            return  this.nextPatient.deletePatient(patientToDelete);
        }

     }

    /**
     * New method implemented to return the name of a patient in the list
     * @param patient
     * @return the name of
     */

    public String searchPatient(DoublePatient patient){
        if(this.nextPatient==null){
            return null;
        }
        else if(this.nextPatient.name.equals(patient.name)){
            return nextPatient.name;
        }
        else{
            return this.nextPatient.searchPatient(patient);
        }
    }

    public DoublePatient getNext(){
            return nextPatient;
    }


    public DoublePatient getPrevious(){
            return previousPatient;
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

    public void setPrevious(DoublePatient patient){
       previousPatient=patient;
    }

    public void setNext(DoublePatient patient){
        nextPatient=patient;
    }

    @Override
    public String toString() {
        return this.getName();
    }

    public void Print(){

            System.out.println("SinglyLinkedList.Patient: "+ this.getName()+"; Age: "+ this.getAge()+"; Illness: "+ this.getIllness());

           }

}
