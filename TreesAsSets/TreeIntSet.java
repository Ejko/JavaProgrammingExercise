package TreesAsSets;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 30/11/13
 * Time: 12:49
 * To change this template use File | Settings | File Templates.
 */

/**
 * Implements the IntSet interface using a tree structure
 */

public class TreeIntSet implements IntSet{

    private int value;
    private TreeIntSet left;
    private TreeIntSet right;

    public TreeIntSet(int n){
        this.value=n;
        this.left=null;
        this.right=null;
    }
    @Override
    public void add(int n) {
        if(n>this.value){       //add larger than current to the right
            if(this.right==null){
                this.right=new TreeIntSet(n);

            }
            else{
                this.right.add(n);
            }
        }
        else if(n<this.value){     //add larger than current to the left
            if(this.left==null){
                this.left=new TreeIntSet(n);
            }
            else{
                this.left.add(n);
            }
        }
        else{
            if(n==this.value){
                //nothing happens if the same value is added
            }
        }
    }
    @Override
    public boolean contains(int n) {

        if(this.value==n){
            return true;
        }
        else if(n<this.value) {
            if(this.left==null){
                return false;
            }
            else{
                   return this.left.contains(n);
            }
        }
        else{
               if(this.right==null){
                   return false;
               }
               else{
                    return this.right.contains(n);
               }

            }
        }
    @Override
    public boolean containsVerbose(int n) {
        if(this.value==n){
             return true;
        }
        else if(n<this.value) {
            if(this.left==null){
                return false;
            }
            else{
                System.out.println("Checked value: "+this.value);   //print the value of the current item checked in the structure
                return this.left.containsVerbose(n);
            }
        }
        else{
             if(this.right==null){
                 return false;
            }
            else{
                System.out.println("Checked value: "+this.value);
                return this.right.containsVerbose(n);
            }
        }
    }

    @Override
    public String toStr() {
            String rightN="", leftN="";
            if(this.left==null){
                leftN="";
            }
            else{
                leftN=this.left.toStr();
            }
            if(this.right==null){
                rightN="";
            }
            else{
                rightN=this.right.toStr();
            }
        return this.value+","+leftN +rightN;

    }
}
