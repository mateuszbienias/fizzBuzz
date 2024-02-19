package pl.sourceryacademy.rules;

public class Buzz implements FizzBuzzRulesInterFace {
    @Override
    public boolean applies(int i) {
        return i % 5 == 0;
    }

    @Override
    public String getResult() {
        return "Buzz";
    }
}
