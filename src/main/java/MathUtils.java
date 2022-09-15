public class MathUtils {

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

}
