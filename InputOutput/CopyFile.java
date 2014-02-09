package InputOutput;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 09/02/14
 * Time: 22:06
 * To change this template use File | Settings | File Templates.
 */

import java.io.*;

/**
 * Takes two names of files from users
 * If the first file does not exist-throw exception
 * If the second file does not exist, create new file or ask the user whether to overwrite existing one
 * Copy first file(if exists) into second file
 */
public class CopyFile {

    public void copyFile(String file1, String file2){

        File srcFile=new File(file1);
        File dstFile=new File(file2);
        BufferedReader in=null;
        PrintWriter out=null;

        try{
            in=new BufferedReader(new FileReader(srcFile));
            if(dstFile.exists()){       //checks if destination file exists
                System.out.print("Would you like to overwrite the file(y/n)?");
                String response=System.console().readLine();
                if(response.equals("y")){       //overwrite file
                    out=new PrintWriter(new FileWriter(dstFile));}
                else{
                    return;         //if n-return as copying will not take place
                }
            }

            else{
                dstFile.createNewFile();
                out=new PrintWriter(new FileWriter(dstFile));
            }
            String line;
            while((line=in.readLine())!=null){
                        out.write(line);

                }
        }
        catch(FileNotFoundException ex){
            System.out.println("File " + srcFile + " does not exist");
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        finally {
            close(in);
            close(out);
        }

    }

    private void close(Closeable read){     //using closable to allow for both read and write buffers to be closed
        try{
            if(read!=null){
                read.close();
            }
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }

    public static void main(String [] args){
        CopyFile cp=new CopyFile();
        System.out.print("Enter source file: ");
        String file1=System.console().readLine();
        System.out.print("Enter destination file: ");
        String file2=System.console().readLine();
        cp.copyFile(file1, file2);
    }
}
