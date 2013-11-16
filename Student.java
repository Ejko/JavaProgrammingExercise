/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 15/11/13
 * Time: 22:37
 * To change this template use File | Settings | File Templates.
 */
public class Student {

    private String name;
    private int age;
    private String course;
    private Student nextStudent;

    public Student(String name,int age, String course){
         this.name=name;
         this.age=age;
         this.course=course;
         this.nextStudent=null;
        }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getCourse(){
        return course;
    }
    public Student getNext(){
        return nextStudent;
    }

    public Student setNext(Student student){
        this.nextStudent=student;

        return this.nextStudent;
    }
    public void printNode(){
        System.out.println("Student: " + this.getName() + "; Age: " + this.getAge() + "; Course: " + this.getCourse());
    }


}
