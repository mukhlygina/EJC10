package homework3.quack;

import homework3.quack.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public String Quack() {
        return "Silence";
    }
}
