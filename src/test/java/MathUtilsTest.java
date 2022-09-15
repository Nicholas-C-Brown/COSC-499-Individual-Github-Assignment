import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

    @Test
    void squareDigits_ValidNumberTest() {

        int num1 = 13;
        int num2 = 262;
        int num3 = 74573;

        int expected1 = 1 + (3 * 3);
        int expected2 = (2 * 2) + (6 * 6) + (2 * 2);
        int expected3 = (7 * 7) + (4 * 4) + (5 * 5) + (7 * 7) + (3 * 3);

        Assertions.assertEquals(expected1, MathUtils.squareDigits(num1));
        Assertions.assertEquals(expected2, MathUtils.squareDigits(num2));
        Assertions.assertEquals(expected3, MathUtils.squareDigits(num3));

    }

    @Test
    void squareDigits_InvalidNumberTest() {

        Assertions.assertEquals(0, MathUtils.squareDigits(-123));

    }


}