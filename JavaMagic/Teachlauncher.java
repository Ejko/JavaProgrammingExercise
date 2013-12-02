package JavaMagic;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 02/12/13
 * Time: 20:32
 * To change this template use File | Settings | File Templates.
 */
public class Teachlauncher {

    public static void main(String [] args){
        Teachlauncher teach=new Teachlauncher();
        teach.launch();
    }

    public void launch(){

       Lecturer lecture=new Lecturer("Kenny");
       lecture.doResearch("Biology");
        lecture.teach("Chemistry");

    }


}
