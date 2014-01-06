package StringStack;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 05/01/14
 * Time: 17:31
 * To change this template use File | Settings | File Templates.
 */

/**
 * String stack implementation using an array
 */
public class StringStackArrayImpl implements  StringStack {
    /**
     * The array that contains the string
     * When full, a new one is created
     */
    private String [] stackArray;
    /**
     * The number of string in the array, i.e. the size of the stack and not the size of the array
     */
    private int size;
    /**
     * The initial size of the array used for initialization
     */
    private static int INITIAL_ARRAY_SIZE=5;

    public StringStackArrayImpl(){
        stackArray=new String[INITIAL_ARRAY_SIZE];
        size=0;

    }

    @Override
    public void push(String newText) {
            if(isAlmostFull()){
                reserveMemory();
            }
        stackArray[size]=newText;
        size++;
    }

    @Override
    public String pop() {
        if(isEmpty()){
            return null;
        }
        else{
            size--;
            String result=stackArray[size];
            stackArray[size]=null;
            return result;
        }
    }

    @Override
    public String peek() {

        if(isEmpty()){
            return null;
        }

        else{
            return stackArray[size-1];
        }
    }
    @Override
    public boolean isEmpty() {
        if(size==0){
            return true;
        }
        else{ return false;}

    }
    /**
     * Checks is the array is about to be filled up to enable new one to be created with a bigger size
     * @return true or false depending on whether the array is almost full or not respectively
     */
    private boolean isAlmostFull(){
        if(stackArray.length-size<1){
            return true;
        }
        else return false;
    }

    /**
     * Creates a new array twice as big and copies all the values from the existing array into it
     * The it points the old array to the new one
     */
    private void reserveMemory(){
        String [] biggerArray=new String[size*2];
        for(int i=0; i<size;i++){
            biggerArray[i]=stackArray[i];
        }

        this.stackArray=biggerArray;
    }
}