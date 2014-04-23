package CircularList;

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

      }
       public Student getFirst(){
           return first;
       }

       public Student addStudent(String name, int age, String course){
           Student newStudent=new Student(name, age, course);
           if(first==null){
              first=newStudent;
              first.setNext(first);
              return first;
           }

           Student aux=first;
           while(aux.getNext()!=first){
               aux=aux.getNext();
               }
               Student nextStudentToAdd=aux.setNext(newStudent);
               nextStudentToAdd.setNext(first);
               return nextStudentToAdd;
               }

        public void deleteStudent(Student s){
            Student current=first;
            if(current==null){
                return;
            }
            if(first.getName().equals(s.getName())){        //head is the required element
                while(current.getNext()!=first){            //find the last elem in the list
                    current=current.getNext();
                }
                current.setNext(first.getNext());           //set the last element to point to the head's next
                first=first.getNext();                      //re-set the first elem correctly
            }
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
        }

        public void printList(){
            Student current=first;
            while(current.getNext()!=first){
                System.out.println("CircularList.Student: " + current.getName() + "; Age: " + current.getAge() + "; Course: " + current.getCourse());
                current=current.getNext();
            }
            System.out.println("CircularList.Student: " + current.getName() + "; Age: " + current.getAge() + "; Course: " + current.getCourse());
            System.out.println("You have reached the end of the list ");
            System.out.println();
        }
        //this does not work as of yet
        public int listLength(Student current){

            if(current.getNext()==first){
                return 1;
            }
            else{
                int result=listLength(current.getNext());
                return result;
            }

        }
}
