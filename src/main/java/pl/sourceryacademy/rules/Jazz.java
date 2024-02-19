package pl.sourceryacademy.rules;

public class Jazz implements FizzBuzzRulesInterFace {
    @Override
    public boolean applies(int i) {
        return i % 7 == 0;
    }

    @Override
    public String getResult() {
        return "Jazz";
    }
}
