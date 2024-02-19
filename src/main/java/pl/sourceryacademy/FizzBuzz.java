package pl.sourceryacademy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    private final static String FIZZ_BUZZ = "FizzBuzz";
    private final static String FIZZ = "Fizz";
    private final static String BUZZ = "Buzz";
    private final static String JAZZ = "Jazz";
    private final static String FIZZ_JAZZ = "FizzJazz";
    private final static String BUZZ_JAZZ = "BuzzJazz";
    private final static String FIZZ_BUZZ_JAZZ = "FizzBuzzJazz";

    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                result.add("FizzBuzzJazz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0 && i % 7 == 0) {
                result.add("FizzJazz");
            } else if (i % 5 == 0 && i % 7 == 0) {
                result.add("BuzzJazz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else if (i % 7 == 0) {
                result.add("Jazz");
            } else {
                result.add(Integer.toString(i));
            }
        }
        return result;
    }
}

