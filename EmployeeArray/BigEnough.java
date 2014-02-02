package EmployeeArray;

import java.lang.reflect.Array;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 09/11/13
 * Time: 17:49
 * To change this template use File | Settings | File Templates.
 */

/**
 * Work required on the static copier method, must be generic
 */
public class BigEnough {

  Integer idArray [];
  String nameArray[];

  /* public BigEnough(){
     Integer idArray[]=new Integer[5];
     String nameArray[]=new String[5];
   }*/
    public void readEmployeeData(){
        int n=0;
        boolean finished=false;
        while(!finished){
            System.out.print("Please enter employee ID for employee "+": ");
            int inputID=Integer.parseInt(System.console().readLine());
            if(inputID==0){
                finished=true;
            }
            else if(n==idArray.length){
                growArrayCapacity(idArray);
            }
            else{
            idArray[n]=inputID;
            n++;
            }

            System.out.print("Please enter employee name for employee " + ": ");
            String inputName=System.console().readLine();
            if(inputName.length()==0){
               finished=true;
            }
            else if(n==nameArray.length){
                growArrayCapacity(nameArray);

           // System.out.print(nameArray.toString());
        }
            else{
                nameArray[n]=inputName;
               n++;
            }
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

    public static <T> T[] growArrayCapacity( T [] arr){
        @SuppressWarnings("unchecked")
        T [] biggerArray;
        biggerArray=(T[]) new Object[arr.length*2];
        for(int i=0; i<arr.length;i++){
            biggerArray[i]=arr[i];
        }
        arr=biggerArray;
        return arr;
    }

    public static void main( String [] args){
        BigEnough newCompany=new BigEnough();
        newCompany.idArray=new Integer[5];
        newCompany.nameArray=new String[5];
        newCompany.readEmployeeData();
        for(int i=0; i<newCompany.idArray.length; i++){
            System.out.println(newCompany.idArray[i]);
            System.out.println(newCompany.nameArray[i]);
        }
       // newCompany.employeeQueries(newCompany.idArray, newCompany.nameArray);
    }
}
