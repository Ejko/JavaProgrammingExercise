package UpcastingDowncasting;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 02/12/13
 * Time: 18:37
 * To change this template use File | Settings | File Templates.
 */
public class PhoneLauncher {

    public static void main(String [] args){
        PhoneLauncher launcher=new PhoneLauncher();
        launcher.launch();

    }

    public void launch(){
        String [] numbers={"123", "345", "678", "978", "109"};

        SmartPhone nexus=new SmartPhone(numbers);
        nexus.browseWeb("google.co.uk");
        System.out.println("The position you are at is: "+ nexus.findPosition());
        nexus.call("12345");
        nexus.playGame("Angry Birds");
        nexus.ringAlarm("9 am");
        nexus.printLastNumbers();
        nexus.call("001243654");
        nexus.call("53896452");



    }
}
