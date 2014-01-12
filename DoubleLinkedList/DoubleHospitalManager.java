package DoubleLinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 14/11/13
 * Time: 21:07
 * To change this template use File | Settings | File Templates.
 */
public class DoubleHospitalManager {
    private DoublePatient listStart=null;

    public static void main(String [] args){

        DoubleHospitalManager dhm=new DoubleHospitalManager();
        dhm.launch();

    }

    public void launch()
    {

       DoublePatient patient1=new DoublePatient("James", 40, "uselessness");
       //listStart=patient1;
        setListHead(patient1);
       DoublePatient patient2=new DoublePatient("Donald", 2, "chilled out");
       listStart.addPatient(patient2);
       DoublePatient patient3=new DoublePatient("Ronald", 4, "obesity");
       listStart.addPatient(patient3);
       DoublePatient patient4=new DoublePatient("Nikita", 35, "compulsive disorder");
       listStart.addPatient(patient4);
       DoublePatient patient5=new DoublePatient("Cisco", 23, "is a router") ;
       listStart.addPatient(patient5);
       DoublePatient patient6=new DoublePatient("David", 47, "dishonesty");
       listStart.addPatient(patient6);
       DoublePatient patient7=new DoublePatient("George", 49, "figures");
       listStart.addPatient(patient7);
        DoublePatient patient8=new DoublePatient("Haskell",10, "functionality");

        forwardPrint();
        backwardPrint();

        listStart.deletePatient(patient5);
        listStart.deletePatient(patient7);
        listStart.deletePatient(patient8);
       // listStart=listStart.getNext();

        forwardPrint();
        backwardPrint();

    }

    public void setListHead(DoublePatient patient){
        this.listStart=patient;

    }

    public void deleteListHead(){

        this.listStart=listStart.getNext();
        listStart.setPrevious(null);

    }

    public DoublePatient getListHead(){
        return this.listStart;
    }

    public void forwardPrint(){
        System.out.println("Now pretty print runs");
        DoublePatient currentPatient=listStart;
        while(currentPatient!=null){
            currentPatient.Print();
            currentPatient=currentPatient.getNext();
        }

        System.out.println();
    }

    public void backwardPrint(){
        System.out.println("Now backward print runs: ");
        DoublePatient finalPatient=listStart;
        while(finalPatient.getNext()!=null){
            finalPatient=finalPatient.getNext();
        }
        DoublePatient currentPatient=finalPatient;
        while(currentPatient!=null){
            currentPatient.Print();
            currentPatient=currentPatient.getPrevious();
        }
        System.out.println();
    }

}
