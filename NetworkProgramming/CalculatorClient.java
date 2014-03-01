package NetworkProgramming;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 01/03/14
 * Time: 19:11
 * To change this template use File | Settings | File Templates.
 */
public class CalculatorClient {

    public static void main(String [] args){

        /* if(System.getSecurityManager()==null){
            System.setSecurityManager(new RMISecurityManager());
        }
         */

        try{
            Remote service= Naming.lookup("//127.0.0.1:1099/calculation");
            CalculatorService calculator=(CalculatorService) service;
            System.out.print("Enter first number: ");
            double num1=Double.parseDouble(System.console().readLine());
            System.out.print("Enter second number: ");
            double num2=Double.parseDouble(System.console().readLine());
            System.out.println("What would you like to do: ");
            System.out.println("1-Add numbers");
            System.out.println("2-Subtract numbers");
            System.out.println("3-Multiply numbers");
            System.out.println("4-Divide numbers");
            int input=Integer.parseInt(System.console().readLine());
            switch(input){
                case 1:
                    Double addition=calculator.addNumbers(num1, num2);
                    System.out.println("Sum is: "+ addition);
                    break;
                case 2:
                    Double subtraction=calculator.subtractNumbers(num1, num2);
                    System.out.println("Subtraction is: "+subtraction);
                    break;
                case 3:
                    Double multiplication=calculator.multiplyNumbers(num1, num2);
                    System.out.println("Product is: "+multiplication);
                    break;
                case 4:
                    Double division=calculator.divideNumbers(num1, num2);
                    System.out.println("Division is: "+division);
                    break;
                default:
                    System.out.println("Not a valid choice");
            }

        }
        catch(MalformedURLException ex){
            ex.printStackTrace();
        }
        catch(RemoteException ex){
            ex.printStackTrace();
        }
        catch(NotBoundException ex){
            ex.printStackTrace();
        }

    }
}
