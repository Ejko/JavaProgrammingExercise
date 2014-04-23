package dry;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 11/12/13
 * Time: 22:16
 * To change this template use File | Settings | File Templates.
 */
public class Comparator {

    public int getMax(int n, int m){
        if (n>m){
            return n;
        }
        else{
            return m;
        }
    }
    public double getMax(double d1, double d2){
           int n=(int) d1;
           int m=(int) d2;
       return  getMax(n,m);
    }
    public String getMax(String num1, String num2){
        int n=Integer.parseInt(num1);
        int m=Integer.parseInt(num2);
        String s=Integer.toString(getMax(n, m));
        return s;
    }

    public static void main(String [] args){

        Comparator comp=new Comparator();
        System.out.println(comp.getMax("5", "3"));
    }



}

