package GenericStack;

import java.lang.reflect.Array;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 14/12/13
 * Time: 21:47
 * To change this template use File | Settings | File Templates.
 */
public class StackArrayImpl<T extends Number> implements Stack<T> {

    private static final int DEFAULT_SIZE=5;
    private T [] contents;
    private int headIndex;
    private final Class<T> type;

    @SuppressWarnings("unchecked")
    public StackArrayImpl(Class<T> type){
        this.type=type;
        contents = (T[]) Array.newInstance(type, DEFAULT_SIZE);
        headIndex=0;
    }
    @Override
    public void push(T newElement) {
        if(headIndex==contents.length){
            grow();
        }
        contents[headIndex]=newElement;
        headIndex++;
    }

    @Override
    public T pop() {
        if(headIndex==0){
            return null;
        }
        headIndex--;
        T result=contents[headIndex];
        contents[headIndex]=null;
        System.out.println("Popping...it's a: "+result);
        return result;
    }

    @Override
    public void print() {
        for(int i=0; i< contents.length;i++){
            if(contents[i]==null){
                break;
            }
            System.out.println("Element "+ (i+1)+": "+contents[i]);
        }
    }

    @Override
    public boolean empty() {
        if(headIndex==0){
            return true;
        }
        else{
            return false;
        }
    }
    @SuppressWarnings("unchecked")
    public void grow(){
            T[] incrCont;
            incrCont=(T[]) Array.newInstance(type,2*contents.length);
            for(int i=0; i<contents.length; i++){
                incrCont[i]=contents[i];
            }
        contents=incrCont;
        }

    }

