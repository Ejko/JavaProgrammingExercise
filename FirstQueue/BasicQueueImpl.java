package FirstQueue;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 18/11/13
 * Time: 20:43
 * To change this template use File | Settings | File Templates.
 */
public class BasicQueueImpl implements BasicQueue {

    private QueueNode end;
    private QueueNode start;
    private int size=0;

    @Override
    public void insert(QueueNode q) {
        System.out.println("Inserting request "+q.getElement()+"...");
        if(end==null){
            end=q;
            start=q;
        }
        else if(start.getNext()==null){
            start.setNext(q);
            start=q;
        }
        size++;
    }

    @Override
    public QueueNode retrieve() {
        QueueNode q=end;
        System.out.println("Retrieving request "+q.getElement()+" ...done");
        if(end==null){
            size--;
            return null;
            }
        else{
            end=end.getNext();
            size--;
            return q;
        }

    }

    @Override
    public int sizeQueue() {
        System.out.println("There are "+ size +" requests in the queue.");
        return size;
        }
 }

