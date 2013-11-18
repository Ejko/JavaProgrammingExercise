package FirstQueue;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 18/11/13
 * Time: 21:27
 * To change this template use File | Settings | File Templates.
 */
public class CreateQueue {

    public static void main(String [] args){
        BasicQueue myQueue=new BasicQueueImpl();

        myQueue.sizeQueue();
        QueueNode queueNode1=new QueueNode(5);
        QueueNode queueNode2=new QueueNode(8);
        QueueNode queueNode3=new QueueNode(12);
        myQueue.insert(queueNode1);
        myQueue.insert(queueNode2);
        myQueue.insert(queueNode3);
        myQueue.sizeQueue();
        myQueue.retrieve();
        QueueNode queueNode4=new QueueNode(13);
        myQueue.insert(queueNode4);
        myQueue.sizeQueue();
        myQueue.retrieve();
        myQueue.retrieve();
        myQueue.sizeQueue();


    }


}
