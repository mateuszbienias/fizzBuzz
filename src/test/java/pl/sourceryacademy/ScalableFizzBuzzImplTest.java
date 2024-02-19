package pl.sourceryacademy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ScalableFizzBuzzImplTest {

    private ScalableFizzBuzzImpl scalableFizzBuzz;
    @BeforeEach
    void setUp() {
        scalableFizzBuzz = new ScalableFizzBuzzImpl();
    }

    @Test
    void testGetResults() {
        List<String> expected = List.of(
                "1", "2", "Fizz", "4", "Buzz", "Fizz", "Jazz", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "Jazz", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz",
                "FizzJazz", "22", "23", "Fizz", "Buzz", "26", "Fizz", "Jazz", "29", "FizzBuzz",
                "31", "32", "Fizz", "34", "BuzzJazz", "Fizz", "37", "38", "Fizz", "Buzz",
                "41", "FizzJazz", "43", "44", "FizzBuzz", "46", "47", "Fizz", "Jazz", "Buzz",
                "Fizz", "52", "53", "Fizz", "Buzz", "Jazz", "Fizz", "58", "59", "FizzBuzz",
                "61", "62", "FizzJazz", "64", "Buzz", "Fizz", "67", "68", "Fizz", "BuzzJazz",
                "71", "Fizz", "73", "74", "FizzBuzz", "76", "Jazz", "Fizz", "79", "Buzz",
                "Fizz", "82", "83", "FizzJazz", "Buzz", "86", "Fizz", "88", "89", "FizzBuzz",
                "Jazz", "92", "Fizz", "94", "Buzz", "Fizz", "97", "Jazz", "Fizz", "Buzz",
                "101", "Fizz", "103", "104", "FizzBuzzJazz", "106", "107", "Fizz", "109", "Buzz",
                "Fizz", "Jazz", "113", "Fizz", "Buzz", "116", "Fizz", "118", "Jazz", "FizzBuzz",
                "121", "122", "Fizz", "124", "Buzz", "FizzJazz", "127", "128", "Fizz", "Buzz",
                "131", "Fizz", "Jazz", "134", "FizzBuzz", "136", "137", "Fizz", "139", "BuzzJazz",
                "Fizz", "142", "143", "Fizz", "Buzz", "146", "FizzJazz", "148", "149", "FizzBuzz",
                "151", "152", "Fizz", "Jazz", "Buzz", "Fizz", "157", "158", "Fizz", "Buzz",
                "Jazz", "Fizz", "163", "164", "FizzBuzz", "166", "167", "FizzJazz", "169", "Buzz",
                "Fizz", "172", "173", "Fizz", "BuzzJazz", "176", "Fizz", "178", "179", "FizzBuzz",
                "181", "Jazz", "Fizz", "184", "Buzz", "Fizz", "187", "188", "FizzJazz", "Buzz",
                "191", "Fizz", "193", "194", "FizzBuzz", "Jazz", "197", "Fizz", "199", "Buzz"
        );

        List<String> actual = ScalableFizzBuzzImpl.getResults(200);
        assertEquals(expected, actual);
    }
}