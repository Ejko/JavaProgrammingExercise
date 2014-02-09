package Exceptionhandling;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 09/02/14
 * Time: 14:57
 * To change this template use File | Settings | File Templates.
 */
import java.util.List;
/**
 *
 */
public interface PrimeDivisorList {
    /**
     * Adds a new Integer to the list of primes
     * @param p
     * @throws NullPointerException if a null Integer is added
     * @throws IllegalArgumentException if a non-prime number is added
     */
      void addPrime(Integer p);

    /**
     * removes a new
      *@param p
     * @return the Integer that was removed from the list
     */
      Integer removePrime(Integer p);

    /**
     * Returns the list of prime divisors created
     * @return the list of prime divisors
     */
      List<Integer> getPrimeDivisorList();

}
