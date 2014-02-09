package Exceptionhandling;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 09/02/14
 * Time: 15:47
 * To change this template use File | Settings | File Templates.
 */
public class PrimeDivisorListImpl implements PrimeDivisorList {

    private List<Integer> primeDivisors;

    public PrimeDivisorListImpl(){
        primeDivisors=new ArrayList<Integer>();
    }

    @Override
    public void addPrime(Integer p) {
        if(p==null){
            throw new NullPointerException("Number is null");       //throws a null pointer exception
        }
        else if(!primeDeterminator(p)){
            throw new IllegalArgumentException("Number not a prime");   //throws an illegal argument if number not a prime
        }
        else{
            primeDivisors.add(p);
        }
    }
    @Override
    public Integer removePrime(Integer p) {
        Integer temp=0;
        if(!primeDivisors.contains(p)){
            return null;
        }
        else{
            temp=p;
            primeDivisors.remove(p);
        }
        return temp;
    }
    @Override
    public String toString() {
        int counter=1;      //holds number of time a number occurs in list
        int product=1;      //holds the product of the numbers in the list
        String printout="[";
        /**
         * To store the number of occurences of a certain number in the list, use a map
         * Map key-integer value; map value-number of occurences
         */
        Map<Integer, Integer> primes=new HashMap<Integer, Integer> ();
        for(Integer current: primeDivisors){
            if(primes.containsKey(current)){
                primes.put(current, counter+1);
            }
            else{
                primes.put(current, counter);
            }
        }
        /**
         * Loop through map to retrieve every integer and the number of time it occurs
         * Add to the printout string in the format required
         */
        for(Map.Entry<Integer, Integer> entry: primes.entrySet()){
                if(entry.getValue()==1){
                    printout=printout+entry.getKey()+" * ";
                    product=product*entry.getKey();
                }
                else{
                    //calculates the value of integer to the power of number of times it occurs
                    int interim=(int) Math.pow(entry.getKey(), entry.getValue());
                    printout=printout+entry.getKey()+ " ^ "+ entry.getValue()+" * ";
                    product=product*interim;
                }
        }
        printout=printout.substring(0, printout.length()-2);    //last * symbol from the string is trimmed
        printout=printout+"= "+product+ "]";
        return printout;
    }

    @Override
    public List<Integer> getPrimeDivisorList() {
        return primeDivisors;
    }

    private boolean primeDeterminator(Integer p){
        boolean ind=false;
        int div=p-1;
        while(div>1){
            if(p%div==0){     //attempt to divide the number by all numbers between 1 and num-1
                ind=false;    // no modulo would mean the number is not prime; exit the program
                break;
            }
            else{
                ind=true;   //if the indicator remained true after all checks, number is prime
                div--;
            }

        }
        return ind;
    }

    public static void main(String [] args){

        PrimeDivisorList newList=new PrimeDivisorListImpl();
        Integer p1=13;
        Integer p2=19;
        Integer p3=11;
        Integer p4=11;
        newList.addPrime(p1);
        newList.addPrime(p2);
        newList.addPrime(p3);
        newList.addPrime(p4);

        System.out.println(newList.toString());

    }
}

