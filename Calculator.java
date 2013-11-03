/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 03/11/13
 * Time: 10:38
 * To change this template use File | Settings | File Templates.
 */
public class Calculator {

    public int add ( int a, int b){
            System.out.println(a+b);
            return a + b;

    }

    public int subtract(int a, int b) {
        System.out.println(a-b);
        return a - b;
    }

    public int multiply(int a, int b) {
        System.out.println(a*b);
        return a * b;

    }

    public double divide(int a, int b) {
        double num1 = (double) a;
        double num2 = (double) b;
        System.out.println(num1/num2);
        return (num1 / num2);
    }

    public int modulus(int a, int b) {
        System.out.println(a%b);
        return a % b;
    }

    public static void main(String[] args) {
    }

}
