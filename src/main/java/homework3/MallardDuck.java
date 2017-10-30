package homework3;

import homework3.fly.FlyWithWings;
import homework3.quack.LoudQuack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new LoudQuack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a real duck");
    }
}
