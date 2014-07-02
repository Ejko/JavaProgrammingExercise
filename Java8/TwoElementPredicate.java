package Java8;

/**
 * Created by liliya on 02/07/14.
 */
@FunctionalInterface
public interface TwoElementPredicate<T> {

    /**
     * Takes two strings and returns the "better" or longer one
     * @param s1
     * @param s2
     * @return true if first string is longer
     */
    boolean better(T s1, T s2);
}
