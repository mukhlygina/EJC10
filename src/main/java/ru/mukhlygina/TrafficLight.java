package ru.mukhlygina;

import java.util.Scanner;

/**
 * TrafficLight is class which allows to find what traffic light is on at the particular moment of time
 *
 * @author Marina Mukhlygina
 */
public class TrafficLight {
    private final int RED_LIGHT_END = 2;
    private final int YELLOW_LIGHT_END = 5;

    /**
     * The method finds what light is on at the particular moment of time
     *
     * @throws IllegalArgumentException if input is negative
     * @param minutes - the moment at which traffic light should be determined
     * @return the traffic light
     */
    public Light findLight(int minutes) {
        if (minutes < 0) {
            throw new IllegalArgumentException("You have entered wrong time! Time should be positive.");
        }

        int moment = minutes % 10;

        if (moment == 0 || moment < RED_LIGHT_END) {
            return Light.RED;
        } else if (moment >= RED_LIGHT_END && moment < YELLOW_LIGHT_END) {
            return Light.YELLOW;
        } else {
            return Light.GREEN;
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int minutes = reader.nextInt();

        TrafficLight trafficLights = new TrafficLight();
        System.out.println("At the moment the light is " + trafficLights.findLight(minutes));
    }

}

