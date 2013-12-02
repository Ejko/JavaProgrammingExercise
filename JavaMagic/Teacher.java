package JavaMagic;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 02/12/13
 * Time: 20:29
 * To change this template use File | Settings | File Templates.
 */
public class Teacher {

    private String name;
    public Teacher(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void teach(String lessonName){
        System.out.println("Teaching lesson: "+ lessonName);
    }
}
