package Java8;


import java.util.Comparator;

public class BetterString  {

    public static <T> T betterElement(T test1, T test2, TwoElementPredicate<T> predicate) {

         if(predicate.better(test1, test2)){
             return test1;
         }
        else{
             return test2;
         }

    }

    public static void main(String [] args){

        String s1="lamb";
        String s2="lambda";

       System.out.println(betterElement(s1, s2, (t1, t2)->t1.length()>t2.length()));

       System.out.println(betterElement(s1, s2, (t1, t2)->true));
    }


}
