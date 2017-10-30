package homework3;

import homework3.fly.FlyBehavior;
import homework3.quack.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    public String performFly() {
       return flyBehavior.Fly();
    }

    public String performQuack() {
        return quackBehavior.Quack();
    }
}
