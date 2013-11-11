/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 11/11/13
 * Time: 18:12
 * To change this template use File | Settings | File Templates.
 */
public class Spy {

    private static int spyCount;
    private int spyID;

    public Spy(int spyID){
        this.spyID=spyID;
        spyCount++;
    }

    public void die(){
        System.out.println("Spy "+ spyID + " has been detected and eliminated");
        spyCount--;
        System.out.println("The total number of spies so far: "+ spyCount);
    }

    public static void main(String [] args){

        Spy spy1=new Spy(1);
        Spy spy2=new Spy(2);
        Spy spy3=new Spy(3);
        Spy spy4=new Spy(4);

         spy1.die();
         spy2.die();

    }
}

