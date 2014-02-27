package NetworkProgramming;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Calendar;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 24/02/14
 * Time: 21:18
 * To change this template use File | Settings | File Templates.
 */
    /**
     * An implementation of the echo exception
     */
    public interface DateService extends Remote {

        /**
         * Answers requests for the date and time with current date and time
         * @return current time and date
         */

        public Calendar dateGetter() throws RemoteException;
    }
