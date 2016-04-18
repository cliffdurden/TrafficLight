package io.khasang.trafficlight.impl;

import io.khasang.trafficlight.iface.TrafficLight;

/**
 * Created by cliff on 2016-04-16.
 */
public class TrafficLightRunner {

    final TrafficLight trafficLight;

    public TrafficLightRunner(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }

    public void runTrafficLight(final TimeParams timeParams) {
        trafficLight.turnOnGreenLight(timeParams.getGreenLightGlowingTime());
        trafficLight.turnOnYellowLight(timeParams.getYellowLightGlowingTime());
        trafficLight.turnOnRedLight(timeParams.getRedLightGlowingTime());
    }

}
