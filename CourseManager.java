/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 15/11/13
 * Time: 22:52
 * To change this template use File | Settings | File Templates.
 */
public class CourseManager {

     private Student first;

      public CourseManager(){
          first=null;
      }

      public static void main(String [] args){

           CourseManager courses=new CourseManager();
           Student jimmy= courses.addStudent("Jimmy", 18, "biology");
           Student vlad= courses.addStudent("Vlad", 20, "computer science");
           Student liliya=courses.addStudent("Liliya", 25, "information systems");
           Student jennifer=courses.addStudent("Jennifer", 21, "maths");
           Student lexi=courses.addStudent("Lexi", 23, "geology");
           Student franco=courses.addStudent("Franco", 19, "human resources");
           Student darcy=courses.addStudent("Darcy",25, "geography");
           Student potter=courses.addStudent("Potter", 21, "engineering");
           Student andy=new Student("Andy", 23, "physics");
            System.out.println("List of students before deletion: ");
            courses.printList();
           // courses.deleteStudent(jimmy);
            courses.deleteStudent(potter);
            //courses.deleteStudent(andy);
            System.out.println("List of students after deletion: ");
            courses.printList();


      }

      //public void launch(){
      //       }

       public Student addStudent(String name, int age, String course){
           Student newStudent=new Student(name, age, course);
           if(first==null){
              first=newStudent;
              first.setNext(first);
            //   System.out.println("THe first student is: "+ first);
              return first;
           }

           Student aux=first;
           while(aux.getNext()!=first){
               aux=aux.getNext();
               }
               Student nextStudentToAdd=aux.setNext(newStudent);
               nextStudentToAdd.setNext(first);

               //System.out.println("The student added is: "+ newStudent);
                return nextStudentToAdd;
               }

        public void deleteStudent(Student s){
            Student current=first;
            while(current.getNext()!=first){
            if(current.getNext().getName().equals(s.getName())){
                current.setNext(current.getNext().getNext());
                System.out.print("Deleted element: ");
                current.getNext().printNode();
           }
           else{
               current=current.getNext();
           }
        }
            //if(current.getNext()==first&&first.getName().equals(s.getName())){
             // current.setNext(current.getNext().getNext());
             // System.out.print("The first deleted element is: ");
             // current.printNode();
           // }

           // return;
       }

        public void printList(){
            Student current=first;
            while(current.getNext()!=first){
                System.out.println("Student: " + current.getName() + "; Age: " + current.getAge() + "; Course: " + current.getCourse());
                current=current.getNext();
            }
            System.out.println("Student: " + current.getName() + "; Age: " + current.getAge() + "; Course: " + current.getCourse());
            System.out.println("You have reached the end of the list ");
            System.out.println();
        }
}
