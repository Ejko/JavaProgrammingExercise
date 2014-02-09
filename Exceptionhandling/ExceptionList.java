package Exceptionhandling;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 27/01/14
 * Time: 19:17
 * To change this template use File | Settings | File Templates.
 */
import java.util.List;
import java.util.ArrayList;

public class ExceptionList {

    List<Integer> list;

    public void exceptList(){
        list=new ArrayList<Integer>();
        int newElement=5;
        try{
            if(newElement>3){
                list.add(newElement);
            }

            System.out.println("The number added is: "+list.get(0));
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public static void main(String [] args){

        ExceptionList newException=new ExceptionList();
        newException.exceptList();
    }

}
