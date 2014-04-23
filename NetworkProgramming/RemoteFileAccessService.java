package NetworkProgramming;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 01/03/14
 * Time: 20:04
 * To change this template use File | Settings | File Templates.
 */
public interface RemoteFileAccessService extends Remote {

    /**
     * Provides the state of a file on a server machine
     * The client must provide route and a file name
     * If it exists, the content of the file will be displayed
     * Only works for text files
     * @param path
     * @return
     */
    public String displayFile(String path) throws RemoteException;
}

