package NetworkProgramming;

import java.net.MalformedURLException;
import java.rmi.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 25/02/14
 * Time: 23:40
 * To change this template use File | Settings | File Templates.
 */
public class DateClient {

    public static void main(String [] args){

       /* if(System.getSecurityManager()==null){
            System.setSecurityManager(new RMISecurityManager());
        }
*/
        try{
            Remote service= Naming.lookup("//127.0.0.1:1699/dateTime");
            DateService dateTime=(DateService) service;
            Calendar date=dateTime.dateGetter();
            SimpleDateFormat format1=new SimpleDateFormat("yyyy-MMM-dd");
            System.out.println(format1.format(date.getTime()));
        }
        catch(MalformedURLException ex){
            ex.printStackTrace();
        }
        catch(RemoteException e){
            e.printStackTrace();
        }
        catch(NotBoundException ex){
            ex.printStackTrace();
        }
    }
}
