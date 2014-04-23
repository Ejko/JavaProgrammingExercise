package Exceptionhandling;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 09/02/14
 * Time: 17:37
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionThrower {

    public void scenario1(){

        try{
            throw new SimpleCheckedException("I am a checked exception and I have been thrown inside a try block");
        }
        catch(SimpleCheckedException ex){
            System.out.print("New checked exception caught");
        }
    }

    public void scenario2() throws SimpleCheckedException {

        throw new SimpleCheckedException("I am a checked exception and I have been thrown outside a try block");

    }

    public static void main(String[] args) {


    }



}
