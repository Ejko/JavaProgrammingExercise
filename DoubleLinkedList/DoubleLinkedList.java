package DoubleLinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 02/02/14
 * Time: 20:05
 * To change this template use File | Settings | File Templates.
 */
public class DoubleLinkedList {

    private DoubleNode head;

    public DoubleLinkedList(){
        head=null;
    }

    public void addNode(DoubleNode node){
        if(head==null){
            head=node;
        }
        DoubleNode current=head;
        while(current.getNext()!=null){
            current=current.getNext();
        }
        current.setNext(node);
        current.getNext().setPrevious(current);
        current=current.getNext();
        }

    public boolean removeNode(DoubleNode node){
        boolean deleted=false;
        DoubleNode current=head;
        if(head==null){
            deleted=false;
        }
        else if(head.getName().equals(node.getName())){
            head=head.getNext();
            head.setPrevious(null);
        }
        else{
            while(current!=null){
                if(current.getName().equals(node.getName())){
                    DoubleNode temp=current.getPrev();
                    current.getPrev().setNext(current.getNext());
                    current.getNext().setPrevious(temp);
                    deleted=true;
                    }
                else{
                    current=current.getNext();
                }
            }

        }
        return deleted;
    }

    public void prettyPrint(){
        DoubleNode current=head;
        if(current==null){
            System.out.println("No elements");
        }
        else{
        while(current!=null){
            System.out.println("Name: "+ current.getName());
            current=current.getNext();
           }
        }
    }


public static void main(String args[]){

    DoubleLinkedList dll=new DoubleLinkedList();
    DoubleNode node1=new DoubleNode("James", 23, "aa");
    DoubleNode node2=new DoubleNode("Jame", 25, "aa");
    DoubleNode node3=new DoubleNode("Jam", 21, "aa");
    DoubleNode node4=new DoubleNode("Ja", 21, "aa");
    dll.addNode(node1);
    dll.addNode(node2);
    dll.addNode(node3);
    dll.addNode(node4);
    dll.removeNode(node1);

   dll.prettyPrint();

}


}