package NetworkProgramming;

import java.nio.channels.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 01/03/14
 * Time: 19:03
 * To change this template use File | Settings | File Templates.
 */
public class CalculatorServerLauncher {

    public static void main(String [] args){

        CalculatorServerLauncher csl=new CalculatorServerLauncher();
        csl.launch();
    }

    public void launch(){
         /* if(System.getSecurityManager()==null){
            System.setSecurityManager(new RMISecurityManager());
        }*/

        try{
            Registry registry= LocateRegistry.createRegistry(1099);
            CalculatorServer server=new CalculatorServer();
            String registryHost="//localhost/";
            String serviceName="calculation";
            registry.rebind(serviceName, server);
        }
        catch(RemoteException ex){
            ex.printStackTrace();
        }
        catch(AlreadyBoundException ex){
            ex.printStackTrace();
        }
    }
}
