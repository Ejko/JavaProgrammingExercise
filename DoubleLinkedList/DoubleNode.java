package DoubleLinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 02/02/14
 * Time: 20:04
 * To change this template use File | Settings | File Templates.
 */
public class DoubleNode {

    private String name;
    private int age;
    private String illness;
    private DoubleNode nextNode;
    private DoubleNode previousNode;

    public DoubleNode(String name, int age, String illness){
        this.name=name;
        this.age=age;
        this.illness=illness;
        this.nextNode=null;
        this.previousNode=null;
    }

    public DoubleNode getNext(){
        return nextNode;
    }

    public DoubleNode getPrev(){
        return previousNode;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    public String getIllness(){
        return illness;
    }

    public void setPrevious(DoubleNode node){
        previousNode=node;
    }

    public void setNext(DoubleNode node){
        this.nextNode=node;
    }

}
