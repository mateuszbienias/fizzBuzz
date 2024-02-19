package pl.sourceryacademy;

import java.util.List;

import static pl.sourceryacademy.FizzBuzz.fizzBuzz;

public class Main {
    public static void main(String[] args) {
        int n = 200;

        System.out.println("New scalable fizzBuzz");
        List<String> result2 = ScalableFizzBuzzImpl.getResults(n);
        for (String s: result2) {
            System.out.println(s + " ");
        }

        System.out.println("Old fizzBuzz");
        List<String> result = fizzBuzz(n);
        for (String s: result) {
            System.out.println("FizzBuzz");
            System.out.println(s + " ");
        }
    }
}

