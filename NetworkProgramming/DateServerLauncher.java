package NetworkProgramming;

import java.net.MalformedURLException;
import java.nio.channels.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class DateServerLauncher {

    public static void main(String [] args){

        DateServerLauncher dsl=new DateServerLauncher();
        dsl.launch();
    }

    public void launch(){

       /* if(System.getSecurityManager()==null){
            System.setSecurityManager(new RMISecurityManager());
        }*/
        try{
            Registry registry= LocateRegistry.createRegistry(1699);
            DateServer dateServer=new DateServer();
            String registryHost="//localhost/";
            String serviceName="dateTime";
           registry.rebind(serviceName, dateServer);
        }
        catch(RemoteException ex){
            ex.printStackTrace();
        }
        catch(AlreadyBoundException e){
            e.printStackTrace();
        }

    }
}
