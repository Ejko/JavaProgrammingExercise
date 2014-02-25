package NetworkProgramming;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class EchoServerLauncher {

    public static void main(String args []){

        EchoServerLauncher esl=new EchoServerLauncher();
        esl.launch();
    }

    private void launch(){

        //1. if there is no security manager, start one
        if(System.getSecurityManager()==null){
//            System.setSecurityManager(new RMISecurityManager());
        }
        try{
            //2. Create a registry is there is not one
            Registry registry = LocateRegistry.createRegistry(1799);
            //3. Create the server object
            EchoServer server=new EchoServer();
            //4. Bind the server object to the registry
            //the registry may be on a different machine
            String registryHost="//127.0.0.1/";
            String serviceName="echo";

            registry.bind(serviceName, server);
        } catch(RemoteException ex){
            ex.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
