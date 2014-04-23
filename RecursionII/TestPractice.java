package RecursionII;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 02/02/14
 * Time: 22:50
 * To change this template use File | Settings | File Templates.
 */
public class TestPractice {

    public void reversyPrint(String str){   //this one prints just one a

        if(str.length()==1){
            System.out.println(str);
        }
        else{
            System.out.println(str);
            reversyPrint(str.substring(0, str.length()-1));
            System.out.println(str);
        }
    }

    public void reversyPrint2(String str){  //this one prints everything except the a
        if(str.length()>=2){
            System.out.println(str);
            reversyPrint2(str.substring(0, str.length()-1));
            System.out.println(str);
        }
    }

    public static void main(String [] args){

        TestPractice testP=new TestPractice();
       // testP.reversyPrint("abcd");
       // testP.reversyPrint2("abcd");
        testP.reversyPrint3("abcd");

    }

    public void reversyPrint3(String str){  //this version prints 2 a's
        if(str.length()>=1){
            System.out.println(str);
            reversyPrint3(str.substring(0, str.length()-1));
            System.out.println(str);
        }
    }




}
