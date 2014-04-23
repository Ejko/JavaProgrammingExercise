package NetworkProgramming;

import java.nio.channels.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 01/03/14
 * Time: 20:30
 * To change this template use File | Settings | File Templates.
 */
public class RemoteFileAccessServerLauncher {

    public static void main(String[] args) {

        RemoteFileAccessServerLauncher rfasl = new RemoteFileAccessServerLauncher();
        rfasl.launch();
    }

    public void launch() {
        /* if(System.getSecurityManager()==null){
            System.setSecurityManager(new RMISecurityManager());
        }*/

        try {
            Registry registry = LocateRegistry.createRegistry(1299);
            RemoteFileAccessServer server = new RemoteFileAccessServer();
            String registryHost = "//localHost/";
            String serviceName = "fileAccess";
            registry.rebind(serviceName, server);
        } catch (RemoteException ex) {
            ex.printStackTrace();
        } catch (AlreadyBoundException ex) {
            ex.printStackTrace();
        }
    }

}
