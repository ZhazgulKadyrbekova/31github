package societe_generale;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("1");
        expectedResult.add("2");
        expectedResult.add("Fizz");

        List<String> actualResult = FizzBuzz(1, 3);
//        assertEqual (expectedResult, actualResult);
    }

    public static List<String> FizzBuzz(int start, int end) {
        List<String> resultList = new ArrayList<>();

        /*
        FizzBuzz is a simple number game in which you count, but replace certain numbers with the words "Fizz" and/or "Buzz", adhering to certain rules.

        Create a FizzBuzz() method that prints out the numbers 1 through 100, separated by newlines.
        Instead of numbers divisible by 3, the method should output "Fizz".
        Instead of numbers divisible by 5, the method should output "Buzz".
        Instead of numbers divisible by 3 and 5, the method should output "FizzBuzz".
         */

        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                resultList.add("FizzBuzz");
                continue;
            }

            if (i % 3 == 0) {
                resultList.add("Fizz");
                continue;
            }

            if (i % 5 == 0) {
                resultList.add("Buzz");
                continue;
            }

            resultList.add(String.valueOf(i));
        }

        return resultList;
    }
}
