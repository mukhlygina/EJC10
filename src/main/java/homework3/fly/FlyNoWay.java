package homework3.fly;

import homework3.fly.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public String Fly() {
        return "Can't fly";
    }
}
