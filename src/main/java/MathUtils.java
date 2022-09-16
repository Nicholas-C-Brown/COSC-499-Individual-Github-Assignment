import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MathUtils {

    private static final List<Integer> SAD_NUMBER_CYCLE = new ArrayList<>(Arrays.asList(4, 16, 37, 58, 89, 145, 42, 20, 4));

    /**
     * Calculates the sum of the squared digits of a given positive integer
     * @param n positive integer
     * @return the sum of the squared digits of n
     */
    public static int squareDigits(int n) {

        int sum = 0;

        while (n > 0) {
            int temp = n % 10;
            sum += temp * temp;
            n = n / 10;
        }

        return sum;
    }

    /**
     * Determines whether a given positive integer is a happy number
     * @param n positive integer
     * @return true if n is a happy number
     */
    public static boolean isHappy(int n) {

        if(n <= 0) return false;

        while(!SAD_NUMBER_CYCLE.contains(n)){
            n = squareDigits(n);
            if(n == 1) return true;
        }

        return false;
    }

    /**
     * Determines whether a given positive integer is prime
     * @param n positive integer
     * @return true if n is prime
     */
    public static boolean isPrime(int n) {
        if(n <= 1) return false;

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }

        return true;
    }


}
