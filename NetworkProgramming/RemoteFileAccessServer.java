package NetworkProgramming;

import java.io.*;
import java.nio.file.Files;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 01/03/14
 * Time: 20:07
 * To change this template use File | Settings | File Templates.
 */
public class RemoteFileAccessServer extends UnicastRemoteObject implements RemoteFileAccessService {

    public RemoteFileAccessServer()throws RemoteException{
        //nothing to do here
    }

    public String displayFile(String path) throws RemoteException {
        String output=" ";
        String currentLine="";
        BufferedReader in=null;
        try{
            in=new BufferedReader(new FileReader(path));
            while((currentLine=in.readLine())!=null){
                output=output+" "+currentLine+"\n";
            }
        }
        catch(FileNotFoundException ex){
            output="File does not exist";
             System.out.print("File does not exist");
            }
        catch(IOException ex){
            ex.printStackTrace();
        }
        finally{
                try{
                    if(in!=null){
                        in.close();
                    }
                }
                catch(IOException e){
                        e.printStackTrace();
                    }
            }
        return output;
    }
}
