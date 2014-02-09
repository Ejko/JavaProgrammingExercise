package Exceptionhandling;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 27/01/14
 * Time: 20:40
 * To change this template use File | Settings | File Templates.
 */
import java.util.List;
import java.util.ArrayList;

public class MorePatients {

    private List<Patient> patients;

    public MorePatients(){      //constructor for the patient list
        patients=new ArrayList<Patient>();
    }

    public void addPatient(){
        String name;
        int yob;
        Patient input;
        /**
         * Until the patient provided is null, continue asking for patient name
         */
        do{
            System.out.print("Please enter a patient name:");
            name=System.console().readLine();
            System.out.print("Please enter a patient year of birth: ");
            yob=Integer.parseInt(System.console().readLine());
            input=createPatient(name, yob);
        } while(input==null);
        patients.add(input);
    }
    public void pp(List<Patient> list){
        for(int i=0; i<patients.size();i++){
            System.out.println("Name: "+patients.get(i).getName());
            System.out.println("YOB: "+patients.get(i).getYOB());
        }
    }

    /**
     * Creates a new patient
     * @param name
     * @param yob
     * @return patient added or null
     * catches an Illegal Argument Exception thrown by the constructor and stops the object from being created
     * returns null if the object was not created
     */
    private Patient createPatient(String name, int yob){
        try{
            return new Patient(name, yob);
        }
        catch(IllegalArgumentException ex){
            System.err.println("Patient not created: " + ex);
            return null;
        }

    }

    public static void main(String [] args){

        MorePatients mp=new MorePatients();
        mp.addPatient();
        mp.addPatient();
        mp.addPatient();
        mp.pp(mp.patients);

    }



}
