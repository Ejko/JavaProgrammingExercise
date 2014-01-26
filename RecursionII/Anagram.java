package RecursionII;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 20/01/14
 * Time: 19:08
 * To change this template use File | Settings | File Templates.
 */
public class Anagram {

    private List<String> anagrams;

    public Anagram(){
       anagrams=new ArrayList<String>();
    }

    public  List<String> anagramGenerator(String word){

        if(word.length()==1){

            anagrams.add(word);
           // System.out.println(anagrams.get(0));
            return anagrams;
        }
        else{
           List<String> newList=anagramGenerator(word.substring(1));
            //anagrams.add(word.substring(0,1)+);
          //  anagrams.add(current+word.substring(0,1));

            System.out.println(word.substring(0,1));
            System.out.println(word.substring(1));
           //anagrams.add(anagramGenerator(word.substring(1))+word.substring(0,1));

        //}


           // System.out.println(anagrams);
        }  // System.out.println(word.substring(1));

        return anagrams;
    }

    public static void main(String [] args){

        Anagram test=new Anagram();
        List<String> ana=test.anagramGenerator("abc");
        System.out.print(ana.toString().replaceAll("[\\[\\],]",""));

    }

}







