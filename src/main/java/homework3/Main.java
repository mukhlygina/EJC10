package homework3;

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        System.out.println(mallardDuck.performFly());
        System.out.println(mallardDuck.performQuack());

        Duck toyDuck = new ToyDuck();
        System.out.println(toyDuck.performFly());
        System.out.println(toyDuck.performQuack());
    }
}
