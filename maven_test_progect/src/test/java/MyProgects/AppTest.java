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
}
