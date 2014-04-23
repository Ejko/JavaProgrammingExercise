package CircularList;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 01/02/14
 * Time: 19:16
 * To change this template use File | Settings | File Templates.
 */
public class CourseManagerScript {

    public static void main(String [] args){
        CourseManagerScript cms=new CourseManagerScript();
        cms.launch();

    }

    public void launch(){
        CourseManager courses=new CourseManager();
        Student jimmy= courses.addStudent("Jimmy", 18, "biology");
        Student vlad= courses.addStudent("Vlad", 20, "computer science");
        Student liliya=courses.addStudent("Liliya", 25, "information systems");
        Student jennifer=courses.addStudent("Jennifer", 21, "maths");
        Student lexi=courses.addStudent("Lexi", 23, "geology");
        Student franco=courses.addStudent("Franco", 19, "human resources");
        Student darcy=courses.addStudent("Darcy",25, "geography");
        Student potter=courses.addStudent("Potter", 21, "engineering");
        System.out.println("List of students before deletion: ");
        courses.printList();
        courses.deleteStudent(jimmy);
        courses.deleteStudent(vlad);
        // courses.deleteStudent(potter);
        //courses.deleteStudent(andy);
        System.out.println("List of students after deletion: ");
        courses.printList();

        System.out.println("Length of list:"+ courses.listLength(courses.getFirst()));
    }
 }
