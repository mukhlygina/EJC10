package homework4;

import java.util.Random;

public class Horse {
    private String name;
    private int speed;
    private int age;

    public Horse() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Horse(String name, int age) {
        this.age = age;
        this.name = name;
        Random random = new Random();
        this.speed = random.nextInt(15);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", age=" + age +
                '}';
    }
}
