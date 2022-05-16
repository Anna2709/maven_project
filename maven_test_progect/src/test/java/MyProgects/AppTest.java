package MyProgects;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    void testFindShortestString1() {
        String[] array = {"hello", "world", "22", ""};
        String result = App.findShortestString(array);
        assertEquals("22", result, "Result is incorrect for array: " + Arrays.toString(array));
    }

    @Test
    void testFindShortestString2() {
        String[] array = {"", ""};
        String result = App.findShortestString(array);
        assertNull(result, "Result is incorrect for array: " + Arrays.toString(array));
    }

    @Test
    void testFindLongStrings() {
        String[] array = {"hello", "world", "22", ""};
        String[] result = App.findLongStrings(array);
        String[] expected = {"hello=5", "world=5"};
        assertArrayEquals(expected, result, "Result is incorrect for array: " + Arrays.toString(array));
    }

    @Test
    void testFindStringWithDigitsOnly1() {
        String[] array = {"hello", "world", "22", ""};
        String result = App.findStringWithDigitsOnly(array);
        assertEquals("22", result, "Result is incorrect for array: " + Arrays.toString(array));
    }

    @Test
    void testFindStringWithDigitsOnly2() {
        String[] array = {"hello", "world", "22", "332"};
        String result = App.findStringWithDigitsOnly(array);
        assertEquals("332", result, "Result is incorrect for array: " + Arrays.toString(array));
    }

    @Test
    void testFindStringWithDigitsOnly3() {
        String[] array = {"hello", "world", ""};
        String result = App.findStringWithDigitsOnly(array);
        assertNull(result, "Result is incorrect for array: " + Arrays.toString(array));
    }


    @Test
    void countStringsWithUniqueCharacters() {
        String[] array = {"hello", "world", "", "java", "computer"};
        int result = App.countStringsWithUniqueCharacters(array);
        assertEquals(2, result, "Result is incorrect for array: " + Arrays.toString(array));
    }

    @Test
    void sumElementsOnEvenPositions() {
        int[] array = {1, -2, 2, 3, 1, -5, -10};
        int result = App.sumElementsOnEvenPositions(array);
        assertEquals(-6, result, "Result is incorrect for array: " + Arrays.toString(array));
    }

    @Test
    void replaceNegativeElementsByZero() {
        int[] originalArray = {1, -2, 0, 3, 1, -5, -10};
        int[] array = Arrays.copyOf(originalArray, originalArray.length);
        App.replaceNegativeElementsByZero(array);
        int[] expected = {1, 0, 0, 3, 1, 0, 0};
        assertArrayEquals(expected, array, "Result is incorrect for array: " + Arrays.toString(originalArray));
    }

    @Test
    void generateFibonacciNumbers() {
        int[] array1 = App.generateFibonacciNumbers(14);
        int[] expected1 = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233};
        assertArrayEquals(expected1, array1, "Incorrectly generated Fibonacci numbers for x = 14");

        int[] array2 = App.generateFibonacciNumbers(1);
        int[] expected2 = {0};
        assertArrayEquals(expected2, array2, "Incorrectly generated Fibonacci numbers for x = 0");

        int[] array3 = App.generateFibonacciNumbers(2);
        int[] expected3 = {0, 1};
        assertArrayEquals(expected3, array3, "Incorrectly generated Fibonacci numbers for x = 0");
    }

    @Test
    void generatePrimeNumbers() {
        int[] array = App.generatePrimeNumbers(10);
        int[] expected = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        assertArrayEquals(expected, array, "Incorrectly generated prime numbers");
    }
}
