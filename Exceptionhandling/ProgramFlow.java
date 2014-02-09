package Exceptionhandling;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 27/01/14
 * Time: 18:57
 * To change this template use File | Settings | File Templates.
 */

import java.util.List;
import java.util.ArrayList;

public class ProgramFlow {

  public static void main(String [] args){

      ProgramFlow pf=new ProgramFlow();
      pf.launch(6);

  }
  public   void launch(int userInput) {
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);
        try {
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
        } catch (IndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }

    }
}
