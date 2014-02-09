package InputOutput;

import org.junit.Test;
import org.junit.Assert.*;

import java.io.FileNotFoundException;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 09/02/14
 * Time: 23:23
 * To change this template use File | Settings | File Templates.
 */
public class CopyFileTest {

    @Test(expected = FileNotFoundException.class)
    public void sourceFileDoesNotExist(){
        CopyFile cp=new CopyFile();
        cp.copyFile("test3.txt", "test2.txt");

    }


}
