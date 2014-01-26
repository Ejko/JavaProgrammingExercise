package UpcastingDowncasting;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 11/12/13
 * Time: 22:44
 * To change this template use File | Settings | File Templates.
 */
public class SmartPhoneCreator {

    public static void main(String [] args){
        String [] nums={"1","2","3","4","5"};
        SmartPhone myPhone=new SmartPhone(nums);
        MobilePhone myPhone1=new MobilePhone(nums);
        myPhone.printLastNumbers();
        myPhone.ringAlarm("9am");
        myPhone.browseWeb("google.co.uk");
        myPhone.call("0123456");
        myPhone.findPosition();
        myPhone.playGame("Angry birds");
        testPhone(myPhone);
        testPhone(myPhone1);
    }
        public static  void testPhone(Phone myPhone){
            myPhone.call("2345");

            }
    }

