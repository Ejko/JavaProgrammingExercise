package ConcurrencyII;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.*;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 17/02/14
 * Time: 18:19
 * To change this template use File | Settings | File Templates.
 */
public class ExecutorImpl {

    private final Queue<Runnable> tasks=new ArrayDeque<Runnable>();
    final Executor executor;
    Runnable active;

    public Executor(Executor executor) {
        this.executor = executor;
    }

    public synchronized void execute(final Runnable r) {
        tasks.offer(new Runnable() {
            public void run() {
                try {
                    r.run();
                } finally {
                    scheduleNext();
                }
            }
        });
        if (active == null) {
            scheduleNext();
        }
    }
    protected synchronized void scheduleNext() {
        if ((active = tasks.poll()) != null) {
            executor.execute(active);
        }
    }




    }



