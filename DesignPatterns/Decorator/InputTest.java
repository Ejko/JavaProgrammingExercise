package DesignPatterns.Decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by liliya on 25/08/2014.
 */
public class InputTest {

    public static void main(String [] args) throws IOException{

        int c;

        try{

            InputStream in = new LowerCaseStreamDecorator(new BufferedInputStream(new FileInputStream("test.txt")));

            while((c = in.read()) >= 0){
               System.out.println((char) c);
            }

            in.close();
        } catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
