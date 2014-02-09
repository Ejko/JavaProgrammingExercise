package Exceptionhandling;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 27/01/14
 * Time: 20:41
 * To change this template use File | Settings | File Templates.
 */
public class Patient {

    private String name;
    private int yob;
    private Patient nextPatient;

    public Patient(String name, int yob){
        if((2014-yob>130)|| (2014-yob<0)) {
            throw new IllegalArgumentException("Age must be <130 or positive");
        } else {
            this.name=name;
            this.yob=yob;
        }
    }
    public Patient getNextPatient(){
        return nextPatient;
    }

    public String getName(){
        return name;
    }
    public int getYOB(){
        return yob;
    }

}
