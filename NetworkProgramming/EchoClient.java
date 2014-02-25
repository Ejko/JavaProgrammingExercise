package NetworkProgramming;

import java.net.MalformedURLException;
import java.rmi.*;

public class EchoClient {

    public static void main(String [] args){

//         if(System.getSecurityManager()==null){
//             System.setSecurityManager(new RMISecurityManager());
//            }
         try{
         Remote service=Naming.lookup("//127.0.0.1:1799/echo");
         EchoService echoService=(EchoService) service;
         String receivedEcho=echoService.echo("Hello!");
             System.out.println(receivedEcho);
            }
         catch(MalformedURLException ex){
            ex.printStackTrace();
        }
         catch(RemoteException ex){
             ex.printStackTrace();
         }
        catch(NotBoundException ex){
            ex.printStackTrace();
        }
    }
}
