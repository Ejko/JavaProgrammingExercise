package UpcastingDowncasting;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 02/12/13
 * Time: 18:19
 * To change this template use File | Settings | File Templates.
 */
public class OldPhone implements Phone {

    private String brand=null;

    public OldPhone(String brand){
        this.brand=brand;
    }

    public String getBrand(){
        return brand;
    }
    @Override
    public void call(String number) {

        System.out.println("Calling "+number+"...");
    }
}
