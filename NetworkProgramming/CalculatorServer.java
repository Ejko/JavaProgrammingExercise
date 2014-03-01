package NetworkProgramming;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 01/03/14
 * Time: 18:57
 * To change this template use File | Settings | File Templates.
 */
public class CalculatorServer extends UnicastRemoteObject implements CalculatorService {

    public CalculatorServer() throws RemoteException{
        //nothing to do here
    }
    @Override
    public double addNumbers(double num1, double num2) throws RemoteException {
        return num1+num2;
    }

    @Override
    public double subtractNumbers(double num1, double num2) throws RemoteException {
        return num1-num2;
    }

    @Override
    public double multiplyNumbers(double num1, double num2) throws RemoteException{
        return num1*num2;
    }

    @Override
    public double divideNumbers(double num1, double num2) throws RemoteException {
        return num1/num2;
    }
}
