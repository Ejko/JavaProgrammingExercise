/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 11/11/13
 * Time: 18:40
 * To change this template use File | Settings | File Templates.
 */
public class Marks {

    public void readMarks(){

        int distinction=0;
        int pass=0;
        int fail=0;
        int invalid=0;
        int input=0;
        int studentCounter=0;
        do {
            System.out.println("Input a mark: ");
            input=Integer.parseInt(System.console().readLine());
            if(input>=70&&input<=100){
                distinction++;}
            else if(input>=50&&input<=69){
                pass++;
                }
            else if(input>=0&&input<=49){
                fail++;}
            else{
                invalid++;

            }
        studentCounter++;

        }
        while(input!=-1);

        System.out.println("There are "+(studentCounter-1)+ " students: "+distinction+ " distinctions, "+pass+ " passes, "
        +fail+ " fails (plus "+(invalid-1)+ " invalid)");

        }
    public static void main( String [] args){
        Marks marks1=new Marks();
        marks1.readMarks();
    }

}


