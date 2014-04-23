package NetworkProgramming;

import java.net.MalformedURLException;
import java.nio.channels.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 01/03/14
 * Time: 20:47
 * To change this template use File | Settings | File Templates.
 */
public class RemoteFIleAccessClient {

    public static void main(String args[]){

        RemoteFIleAccessClient rfac=new RemoteFIleAccessClient();
        rfac.launch();

    }
    public void launch(){

        /* if(System.getSecurityManager()==null){
            System.setSecurityManager(new RMISecurityManager());
        }*/
        try{
            Remote service= Naming.lookup("//127.0.0.1:1299/fileAccess");
            RemoteFileAccessService fileAccess= (RemoteFileAccessService) service;
            System.out.print("Provide path to file: ");
            String input=System.console().readLine();
            String output=fileAccess.displayFile(input);
            System.out.println(output);
        }
        catch(RemoteException ex){
            ex.printStackTrace();
        }
        catch(MalformedURLException ex){
            ex.printStackTrace();
        }
        catch(AlreadyBoundException ex){
            ex.printStackTrace();
        }
        catch(NotBoundException ex){
            ex.printStackTrace();
        }

    }
}
