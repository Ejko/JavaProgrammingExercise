package SinglyLinkedList;

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
    private Patient nextPatient;

    public Patient(String name, int age, String illness){
        this.name=name;
        this.age=age;
        this.illness=illness;
        this.nextPatient=null;
    }

    public void addPatient(Patient newPatient){
        if(this.nextPatient==null){     //the end of the list
            this.nextPatient=newPatient;
        }
        else{
            this.nextPatient.addPatient(newPatient); //continue through te list until last patient is reached
        }
    }

    public boolean deletePatient(Patient patientToDelete){
        if(this.nextPatient==null){     //no patients in the list
            return false;
        }
        else if(this.nextPatient.name.equals(patientToDelete.name)){    //next patient is the one required
            this.nextPatient=nextPatient.nextPatient;                   //switch the pointer to the element after
            return true;
            }
        else{
           return  this.nextPatient.deletePatient(patientToDelete);
        }
    }
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

    System.out.println("SinglyLinkedList.Patient: "+ this.getName());
    System.out.println("Age: "+ this.getAge());
    System.out.println("Illness: "+ this.getIllness());
       }


}
