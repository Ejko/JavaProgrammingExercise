package NetworkProgramming;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Step 2 of 5 on the server side: implement the service
 */
public class EchoServer extends UnicastRemoteObject implements EchoService {

    public EchoServer()throws RemoteException{
    //nothing to initialize for this server
    }

   // @Override
    public String echo(String s) throws RemoteException {

        /**
         * This println is not necessary but it helps verifying if the server received the call or not
         * on the remote machine
         */
        System.out.println("Replied to some client saying: "+s+ "'");
        return s;
    }
}
