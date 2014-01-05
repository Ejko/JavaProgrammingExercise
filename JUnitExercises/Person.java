package JUnitExercises;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 05/01/14
 * Time: 14:59
 * To change this template use File | Settings | File Templates.
 */
public class Person {

    public String getInitials(String fullName){
        String result="";
        for(int i=0; i<fullName.length(); i++){
            if(fullName.charAt(i)==' ' &&fullName.charAt(i+1)==' '){
               fullName=fullName.substring(0,i)+fullName.substring(i+1);
            }

        }
        String [] words=fullName.split(" ");
        for(int i=0; i<words.length;i++){

            String nextInitial=""+words[i].charAt(0);
            result=result+nextInitial.toUpperCase();
            }

        return result;
    }

    public static void main(String [] args){

        Person p=new Person();
        p.getInitials("Liliya  Stefanova");

    }
}

