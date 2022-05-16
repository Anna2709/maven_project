package MyProgects;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    // task 1
    public static String findShortestString(String[] array) {
        String shortestString = array[0];
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() != 0 && array[i].length() < shortestString.length()) {
                shortestString = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() == shortestString.length()) {
                counter++;
            }
        }
        if (counter > 1) shortestString = null;
        return shortestString;
    }

    // task 2
    public static String[] findLongStrings(String[] array) {
        int averageLength = 0;
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            averageLength = averageLength + array[i].length();
        }
        averageLength = averageLength / (array.length - 1);

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > averageLength) {
                counter++;
            }
        }
        String[] arrayString = new String[counter];


        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i].length() > averageLength) {
                arrayString[counter - 1] = array[i] + "=" + array[i].length();
                counter--;
            }
        }
        return arrayString;
    }

    // task 3
    public static String findStringWithDigitsOnly(String[] row) {
        String numberLine = null;
        int counter = 0;

        for (int i = 0; i < row.length; i++) {
            if (row[i].matches("[0-9]+") && counter < 2) {
                numberLine = row[i];
                counter++;

            }
        }
        return numberLine;
    }

    // task 4
    public static int countStringsWithUniqueCharacters(String[] array) {
        int counter = 0;
        boolean sameSign = false;
        for (int i = 0; i < array.length; i++) {
            if (!array[i].isEmpty()) {
                char[] charArr = array[i].toCharArray();
                for (int j = 0; j < charArr.length; j++) {
                    for (int k = j + 1; k < charArr.length; k++) {
                        if (charArr[j] == charArr[k]) sameSign = true;
                    }
                }
                if (!sameSign) {
                    counter++;
                }
                sameSign = false;
            }
        }
        return counter;
    }

    public static Map<Character, Integer> countCharsInString(String line) {
        line = line.replaceAll("[^da-zA-Zа-яёА-ЯЁ]", "");
        Map<Character, Integer> result = new HashMap<>();
        char[] arr = line.toCharArray();
        for (int i = 0; arr.length > i; i++) {
            int count = 0;
            for (int j = 0; arr.length > j; j++) {
                if (arr[i] == arr[j]) count++;
            }
            result.put(arr[i], count);
        }
        for( Map.Entry<Character, Integer> entry : result.entrySet() ){
            System.out.println( entry.getKey() + " => " + entry.getValue() );
        }
        return result;
    }

    public static int sumElementsOnEvenPositions(int[] array) {
        int evenSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                evenSum += array[i];
            }
        }
        return evenSum;
    }

    public static void replaceNegativeElementsByZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }
        }
    }
}
