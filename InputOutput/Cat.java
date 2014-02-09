package InputOutput;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 09/02/14
 * Time: 19:45
 * To change this template use File | Settings | File Templates.
 */
import java.io.*;
import java.io.PrintWriter;
/**
 * Takes a file name from the command line
 * Shows contents on screen if file exists; says so if it does not
 */
public class Cat {

    public void showFileContents(String name){
        File file=new File(name);
        BufferedReader in=null;
        try{
            in=new BufferedReader(new FileReader(file));
            String line;
            while((line=in.readLine())!=null){
                System.out.println(line);
            }
        }
        catch(FileNotFoundException ex){
            System.out.println("File "+ name+ " does not exist");
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        finally {
            closeReader(in);
            }
        }

    private void closeReader(Reader reader){
        try{
            if(reader!=null){
                reader.close();
            }
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }


    public static void main(String [] args){

        Cat openFile=new Cat();
        System.out.print("Please enter a file name: ");
        String input=System.console().readLine();
        openFile.showFileContents(input);
    }
}
