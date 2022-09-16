import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    @Test
    void isHappy_HappyNumbersTest(){

        int happy1 = 13;
        int happy2 = 77854;
        int happy3 = 189886;

        Assertions.assertTrue(MathUtils.isHappy(happy1));
        Assertions.assertTrue(MathUtils.isHappy(happy2));
        Assertions.assertTrue(MathUtils.isHappy(happy3));

    }

    @Test
    void isHappy_UnhappyNumbersTest(){

        int unhappy1 = 200;
        int unhappy2 = 456;
        int unhappy3 = 12346;

        Assertions.assertFalse(MathUtils.isHappy(unhappy1));
        Assertions.assertFalse(MathUtils.isHappy(unhappy2));
        Assertions.assertFalse(MathUtils.isHappy(unhappy3));

    }

    @Test
    void isPrimeTest(){
        List<Integer> expected = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);

        List<Integer> actual = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            if(MathUtils.isPrime(i)) actual.add(i);
        }

        Assertions.assertEquals(expected, actual);
    }


}