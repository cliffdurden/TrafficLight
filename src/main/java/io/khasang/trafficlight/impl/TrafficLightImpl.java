package io.khasang.trafficlight.impl;

import io.khasang.trafficlight.iface.TrafficLight;

import java.util.concurrent.TimeUnit;

/**
 * Created by cliff on 2016-04-16.
 */
public class TrafficLightImpl implements TrafficLight {

    private static final String RED_LIGHT = "Red lights";
    private static final String YELLOW_LIGHT = "Yellow lights";
    private static final String GREEN_LIGHT = "Green lights";

    public void turnOnRedLight(final long glowTime) {
        System.out.println("!!!" + RED_LIGHT + " !!!");
        waitTime(glowTime);
    }

    public void turnOnYellowLight(final long glowTime) {
        System.out.println("!!! " + YELLOW_LIGHT + " !!!");
        waitTime(glowTime);
    }

    public void turnOnGreenLight(final long glowTime) {
        System.out.println("!!! " + GREEN_LIGHT + " !!!");
        waitTime(glowTime);
    }


    private void waitTime(final long glowTime) {
        try {
            TimeUnit.MINUTES.sleep(glowTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
