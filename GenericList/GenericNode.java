package GenericList;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 14/12/13
 * Time: 11:24
 * To change this template use File | Settings | File Templates.
 */
public interface GenericNode<T> {

    /**
     * gets the value of the next element in the list
     * @return the value of the element
     */
    T  getValue();
    /**
     * gets the next element
     * @return next element in the list reference
     */
     GenericNode<T> getNext();
    /**
     * set the next element in the list
     * @param node the object reference to point the next elem to
     */
    void setNext(GenericNode<T> node);

    /**
     * get the previous element from the list
     * @return reference to the previous list element
     */
   GenericNode<T> getPrevious();

    /**
     * sets the previous element in the list
     * @param object the element to point to
     */

    void setPrevious(GenericNode<T> object);


}
