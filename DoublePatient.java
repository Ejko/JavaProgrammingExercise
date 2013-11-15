/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 14/11/13
 * Time: 20:33
 * To change this template use File | Settings | File Templates.
 */
public class DoublePatient {
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
     public void addPatient(DoublePatient newPatient){
        if(this.nextPatient==null){
            this.nextPatient=newPatient;
            newPatient.previousPatient=this;
        }
        else{

            this.nextPatient.addPatient(newPatient);
         }
     }

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

    @Override
    public String toString() {
        return "DoublePatient(" + this.getName() + ")";
    }

    public void Print(){

            System.out.println("Patient: "+ this.getName()+"; Age: "+ this.getAge()+"; Illness: "+ this.getIllness());

           }

}
