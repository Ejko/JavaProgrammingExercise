/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 09/11/13
 * Time: 17:49
 * To change this template use File | Settings | File Templates.
 */
public class Employees {

  int idArray [];
  String nameArray[];

   public Employees(){
     int idArray[];
     String nameArray [];
   }

   /* public String []  copyToBiggerArray(String []array){
        String biggerArray [];
        biggerArray=new String [2*array.length];
        for(int n=0; n<array.length;n++){
            biggerArray[n]=array[n];
            }
        return biggerArray;
    }
    public int [] copyToBiggerArray(int [] array){
        int biggerArray [];
        biggerArray=new int [2*array.length];
        for(int n=0; n<array.length;n++){
            biggerArray[n]=array[n];
        }
        return biggerArray;
        }
        */
    public void readEmployeeData(){
        int n=0;
        boolean finished=false;
        while(!finished){
            System.out.print("Please enter employee ID for employee "+(n+1)+": ");
            int inputID=Integer.parseInt(System.console().readLine());
            if(inputID==0){
                finished=true;
            }
            else if(n>idArray.length){
                int biggerArray [];
                biggerArray=new int [2*idArray.length];
                for(int i=0; i<idArray.length;i++){
                    biggerArray[i]=idArray[i];
                    // copyToBiggerArray(idArray)[n]=inputID;
                //System.out.println(copyToBiggerArray(idArray));
                }
                idArray=biggerArray;
             //   System.out.print(idArray.toString());
            }
            else{
            idArray[n]=inputID;
            }

            System.out.print("Please enter employee name for employee "+(n+1) + ": ");
            String inputName=System.console().readLine();
            if(inputName.length()==0){
               finished=true;
            }
            else if(n>nameArray.length){
            String biggerArrayName [];
            biggerArrayName=new String [2*nameArray.length];
            for(int j=0; j<nameArray.length;j++){
                biggerArrayName[j]=nameArray[j];
                // copyToBiggerArray(idArray)[n]=inputID;
                //System.out.println(copyToBiggerArray(idArray));
            }
            nameArray=biggerArrayName;
           // System.out.print(nameArray.toString());
        }
            else{
                nameArray[n]=inputName;
            }
            n++;
        }
    }

    public void employeeQueries(int [] idArray, String [] nameArray){
        System.out.print("List of employees with even number ID or name starting with S");
        for(int n=0; n<idArray.length;n++){
                if((idArray[n]/2==0)||(nameArray[n].substring(0,1)=="S")){
                    System.out.println("Employee ID: "+ idArray[n]);
                    System.out.println("Employee name: "+nameArray[n]);
            }
        }
    }

    public static void main( String [] args){
        Employees newCompany=new Employees();
        newCompany.idArray=new int [3];
        newCompany.nameArray=new String [3];
        newCompany.readEmployeeData();
        for(int i=0; i<newCompany.idArray.length; i++){
            System.out.print(newCompany.idArray[i]);
        }
       // newCompany.employeeQueries(newCompany.idArray, newCompany.nameArray);
    }
}
