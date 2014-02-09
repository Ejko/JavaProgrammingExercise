package Exceptionhandling;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 27/01/14
 * Time: 19:29
 * To change this template use File | Settings | File Templates.
 */


public class InputExceptionMeanAvg {

    /**
     * @throws NumberFormatException if a number which is invalid is entered
     * Prints the mean average of numbers. The number of entries is pre-specified by the user
     */
    public void calcAvg(){
        int counter=0;
        int avg=0;

        int howMany=howManyNumbers();

                 do{
                     try{ //the try catch block is inside the do/while loop to allow for number to be re-entered
                     System.out.print("Please enter a number: ");
                     int input=Integer.parseInt(System.console().readLine());
                     avg=avg+input;
                     counter++;
                    } catch (NumberFormatException ex){
                             System.out.println("Please enter a valid number");
                         }
                 } while(counter<howMany);

                 System.out.println("The average is:"+ avg/counter);
         }

    public int howManyNumbers(){
        try{
            System.out.print("How many numbers would you like to enter: ");
            return Integer.parseInt(System.console().readLine());
        }
        catch(NumberFormatException ex){
            System.out.print("Please enter a valid number: ");
            return Integer.parseInt(System.console().readLine());
        }
    }

    public static void main(String [] args){

        InputExceptionMeanAvg newTest=new InputExceptionMeanAvg();
        newTest.calcAvg();
    }
}
