package io.khasang.trafficlight.main;

import io.khasang.trafficlight.impl.TimeParams;
import io.khasang.trafficlight.impl.TimeParamsReader;
import io.khasang.trafficlight.impl.TrafficLightImpl;
import io.khasang.trafficlight.impl.TrafficLightRunner;

public class App {

    public static void main(String[] args) {
        System.out.print("Traffic Light app started.");
        TimeParams timeParams = new TimeParamsReader().readParams();
        TrafficLightRunner runner = new TrafficLightRunner(new TrafficLightImpl());
        runner.runTrafficLight(timeParams);
    }
}
