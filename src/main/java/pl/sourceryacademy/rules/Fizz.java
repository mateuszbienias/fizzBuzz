package pl.sourceryacademy.rules;

public class Fizz implements FizzBuzzRulesInterFace {
    @Override
    public boolean applies(int i) {
        return i % 3 == 0;
    }

    @Override
    public String getResult() {
        return "Fizz";
    }
}
