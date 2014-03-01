package NetworkProgramming;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Calendar;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 01/03/14
 * Time: 18:50
 * To change this template use File | Settings | File Templates.
 */
public interface CalculatorService extends Remote {

    /**
     * Adds two numbers together
     * @param num1, num2
     * @return the result of the addition
     */

    public double addNumbers(double num1, double num2) throws RemoteException;

    /**
     * Subtract two numbers
     * @param num1, num2
     * @return the result of the subtraction
     */

    public double subtractNumbers(double num1, double num2) throws RemoteException;


    /**
     * Multiply two numbers together
     * @param num1, num2
     * @return the result of the multiplication
     */

    public double multiplyNumbers(double num1, double num2) throws RemoteException;

    /**
     * Divide two numbers together
     * @param num1, num2
     * @return the result of the division
     */

    public double divideNumbers(double num1, double num2) throws RemoteException;
}
