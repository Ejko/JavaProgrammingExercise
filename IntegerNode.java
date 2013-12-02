/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 16/11/13
 * Time: 16:30
 * To change this template use File | Settings | File Templates.
 */
public class IntegerNode {

    private int n;
    private IntegerNode nextInteger;
    //private IntegerNode previousInteger;

    public IntegerNode(int n){
        this.n=n;
        nextInteger=null;
    }

    public int getNumber(){
        return n;
    }

    public IntegerNode getNext(){
        return nextInteger;
    }

    public void setNext(IntegerNode n){
        this.nextInteger=n;
    }

    @Override
    public String toString() {
        return "IntegerNode(" + this.getNumber() + ")";
    }

    // public IntegerNode getPrevious(){
    //    return previousInteger;
    //}

   // public void setPrevious(IntegerNode i){
    //    this.previousInteger=i;
   // }
}
