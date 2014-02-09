package InputOutput;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 03/02/14
 * Time: 20:34
 * To change this template use File | Settings | File Templates.
 */
import java.io.File;
/**
 * Takes a name from the user at the command line and creates a directory with that name.
 */
public class MkDir {

    private String fileName;

    public MkDir(String fileName){
        this.fileName=fileName;
    }

    public void makeDir(){
        File newDir=new File(fileName);
        newDir.mkdir();
    }

    public static void main(String [] args){
        String input=args[0];
        MkDir mkdr=new MkDir(input);
        mkdr.makeDir();
    }



}
