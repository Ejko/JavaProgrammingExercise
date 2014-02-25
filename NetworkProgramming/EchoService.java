package NetworkProgramming;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * An implementation of the echo exception
 * Server side set up: Step 1 of 5
 */
public interface EchoService extends Remote {

    /**
     * returns the same string passed as parameter
     * @param s a string
     * @return the same string passed as a parameter
     */

    public String echo(String s) throws RemoteException;
}
