package InputOutput;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 03/02/14
 * Time: 20:16
 * To change this template use File | Settings | File Templates.
 */

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Shows on screen the names of the files in the current directory
 */
public class ListDirectory {

    public static void listFiles(){
       String workingDir = System.getProperty("user.dir");
       File currentDir=new File(workingDir);
        try{
            for(int i=0; i<currentDir.listFiles().length;i++){
                System.out.println("Directory:"+currentDir.listFiles()[i]);
            }
        }
        catch(NullPointerException ex){
            System.out.println("No elements in list");
            }
        }
    public static void main(String [] args){

        listFiles();

    }


}
