package ru.mukhlygina;

import java.util.Scanner;

/**
 * This programm finds what light is on at the particular moment of time
 * which user enters via console
 *
 * @author Marina Mukhlygina
 * @return which light is on TrafficLight
 */
public class TrafficLight {
    private final int RED_LIGHT = 2;
    private final int YELLOW_LIGHT = 3;

    public Light findLight(int minutes) {
        if (minutes < 0) {
            throw new IllegalArgumentException("You have entered wrong time! Time should be positive.");
        }

        int moment = minutes % 10;

        if (moment == 0 || moment < RED_LIGHT) {
            return Light.RED;
        } else if (moment >= RED_LIGHT && moment < YELLOW_LIGHT) {
            return Light.YELLOW;
        } else {
            return Light.GREEN;
        }
    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int minutes = reader.nextInt();

        TrafficLight lights = new TrafficLight();
        System.out.println("At the moment the light is " + lights.findLight(minutes));
    }

}

