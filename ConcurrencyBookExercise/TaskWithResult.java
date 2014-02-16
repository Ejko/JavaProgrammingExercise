package ConcurrencyBookExercise;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 16/02/14
 * Time: 17:28
 * To change this template use File | Settings | File Templates.
 */

import java.util.concurrent.*;
import java.util.*;

/**
 * Implementing a task class as a callable enables ability to return a value
 * Callable needs to be specified with a generic type
 */
public class TaskWithResult implements Callable<String>{

    private int id;

    public TaskWithResult(int id){
        this.id=id;
    }
    @Override
    //instead of run() the callable interface uses call()
    public String call() throws Exception {
        return "result of TaskWithResult: "+ id;
    }

}
