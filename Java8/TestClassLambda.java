package Java8;

import java.util.Comparator;
import java.util.Arrays;
import java.util.List;

public class TestClassLambda {

    static final String [] testString={ "one", "two", "three"};
    static final List<String> list= Arrays.asList("one", "two", "three");


    public static void main(String [] args){


        Arrays.sort(testString, (String s1,String s2)->{return(s1.length()-s2.length());});

        list.forEach(System.out::println);

    }





}
