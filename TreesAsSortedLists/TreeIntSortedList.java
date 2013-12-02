package TreesAsSortedLists;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 30/11/13
 * Time: 22:47
 * To change this template use File | Settings | File Templates.
 */
public class TreeIntSortedList implements IntSortedList {

    private int value;
    private TreeIntSortedList left;
    private TreeIntSortedList right;

    public TreeIntSortedList(int n){
        this.value=n;
        this.left=null;
        this.right=null;
    }

    @Override
    public void add(int n) {
        if(n>=this.value){
            if(this.right==null){
                this.right=new TreeIntSortedList(n);
            }
            else{
                this.right.add(n);
            }
        }
        if(n<value){
            if(this.left==null){
                this.left=new TreeIntSortedList(n);
            }
            else{
                this.left.add(n);
            }
        }
    }

    @Override
    public boolean contains(int n) {

        if(n==this.value){
            return true;
        }
        else if(n<this.value){

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
    public String toStr() {
        String leftN="", rightN="";
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

        return leftN+this.value+","+rightN;
    }
}
