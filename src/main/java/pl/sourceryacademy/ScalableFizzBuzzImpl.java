package pl.sourceryacademy;

import pl.sourceryacademy.rules.Buzz;
import pl.sourceryacademy.rules.Fizz;
import pl.sourceryacademy.rules.FizzBuzzRulesInterFace;
import pl.sourceryacademy.rules.Jazz;

import java.util.ArrayList;
import java.util.List;

public class ScalableFizzBuzzImpl {

    private static List<FizzBuzzRulesInterFace> rules = List.of(new Fizz(), new Buzz(), new Jazz());


    public static List<String> getResults(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            result.add(checkNumbersByRules(i));
        }
        return result;
    }

    private static String checkNumbersByRules(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        for (FizzBuzzRulesInterFace rule : rules) {
            if (rule.applies(i)) {
                stringBuilder.append(rule.getResult());
            }
        }
        if (stringBuilder.length()==0) {
            return String.valueOf(i);
        }
        return stringBuilder.toString();
    }
}
