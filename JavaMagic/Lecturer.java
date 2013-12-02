package JavaMagic;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 02/12/13
 * Time: 20:31
 * To change this template use File | Settings | File Templates.
 */
public class Lecturer extends Teacher {

    public Lecturer(String name){
        super(name);
    }

    public void doResearch(String topic){
        System.out.println("Doing research on: "+topic);
    }
}
