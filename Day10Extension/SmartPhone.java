package Day10Extension;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 02/12/13
 * Time: 18:33
 * To change this template use File | Settings | File Templates.
 */
public class SmartPhone extends MobilePhone {

    public SmartPhone(String[] numbers,String brand) {

        super(numbers, brand);

    }
    public void browseWeb(String webAddress){

        System.out.println("Loading page "+ webAddress+ " ....");
    }
    public String findPosition(){
      return "0,0";
    }
    @Override
    public void call(String number){
        if(number.substring(0,2).equals("00")){
            System.out.println("Calling "+number+ " through the internet to save money");
        }
        else{
            super.call(number);
        }
    }

    //What is the least that can be done in this class to enable playGames (private in MobilePhone) to be accessed?
    //The method could be completely implemented again or





}
