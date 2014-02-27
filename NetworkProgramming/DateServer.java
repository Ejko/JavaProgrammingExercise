package NetworkProgramming;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Calendar;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 25/02/14
 * Time: 23:19
 * To change this template use File | Settings | File Templates.
 */
public class DateServer extends UnicastRemoteObject implements DateService {

    public DateServer() throws RemoteException{
        //nothing to initialize
    }
    @Override
    public Calendar dateGetter() throws RemoteException {

        return Calendar.getInstance();
    }
}
