package homework3;

import homework3.fly.FlyNoWay;
import homework3.quack.MuteQuack;

public class ToyDuck extends Duck {
    public ToyDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("This is toy");
    }
}
