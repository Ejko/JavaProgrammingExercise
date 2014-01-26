package UpcastingDowncasting;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 02/12/13
 * Time: 18:20
 * To change this template use File | Settings | File Templates.
 */
public class MobilePhone extends OldPhone {

    String [] lastNumbers;

    public MobilePhone(String [] numbers){
       lastNumbers=new String[10];
       lastNumbers=numbers;
         }
    public void ringAlarm(String time){
        System.out.println("Wake up! it's "+ time+" o'clock");
    }

    public void playGame(String name){
        System.out.println("Would you like to play" + name + " Loading...");
    }

    public void printLastNumbers(){
        for(int i=0; i<lastNumbers.length;i++){
            System.out.println("Number "+(i+1)+" is: "+lastNumbers[i]);
        }
    }
}

