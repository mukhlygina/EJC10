package homework4;

import java.util.Random;

public class Horse {
    private String name;
    private int speed;
    private String breed;
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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Horse(String name) {
        this.name = name;
        Random random = new Random();
        this.speed = random.nextInt(15);
    }

    public Horse(int speed, String breed, int age) {
        this.age = age;
        this.breed = breed;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}
