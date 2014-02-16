package Concurrency;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 16/02/14
 * Time: 09:55
 * To change this template use File | Settings | File Templates.
 */
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
     * A class that performs a costly computation
     */
    public class Computation implements Runnable {
        /**
         * The result of the computation.
         */
        private double result = 0;

        /**
         * True when the computation result is ready, false otherwise.
         */
        private boolean resultReady = false;

        private final AtomicBoolean resultReadyAtomic = new AtomicBoolean(false);

        /**
         * The number to perform the computation with
         */
        private double[] numbers = null;

        /**
         * A new computation.
         *
         * @param data an array of doubles to perform the computation
         */
        public Computation(double[] data) {
            this.numbers = data;
        }

        /**
         * Runs the computation.
         */
        public void run() {
            synchronized (this) {
                double result = 0.0;

                // A new Random is created here because Math.random() is
                // synchronised, which leads to no improvement being seen
                Random r = new Random(-1);
                for (int i = 0; i < numbers.length; i++) {
                    result += Math.sqrt(numbers[i]);
                    result += Math.sqrt(r.nextDouble() * result);
                    result += Math.sqrt(r.nextDouble() * result);
                    result += Math.sqrt(r.nextDouble() * result);
                }
                this.result = result;
                this.resultReady = true;
                resultReadyAtomic.set(true);
                this.notifyAll();
            }
        }

        /**
         * Returns the result of the computation if it is ready.
         * If it is not, it blocks until it is.
         *
         * @return the result of the computation.
         */
        public double getResult() {
            synchronized (this) {
                while (!resultReady) {
                    try {
                        this.wait();
                    } catch (InterruptedException ex) {
                        // Nothing to do, just sleep less
                    }
                }
                resultReady = false;
                return result;
            }
        }
 }