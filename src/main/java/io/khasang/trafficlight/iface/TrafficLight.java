package io.khasang.trafficlight.iface;

import java.util.concurrent.TimeUnit;

/**
 * Created by cliff on 2016-04-16.
 */
public interface TrafficLight {

    void turnOnRedLight(final long glowTime);

    void turnOnYellowLight(final long glowTime);

    void turnOnGreenLight(final long glowTime);

}
