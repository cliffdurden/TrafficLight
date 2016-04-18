package io.khasang.trafficlight.impl;

/**
 * Created by cliff on 2016-04-16.
 */
public class TimeParams {

    private final long redLightGlowingTime;
    private final long yellowLightGlowingTime;
    private final long greenLightGlowingTime;

    public TimeParams(final long redLightGlowingTime, final long yellowLightGlowingTime, final long greenLightGlowingTime) {
        this.redLightGlowingTime = redLightGlowingTime;
        this.yellowLightGlowingTime = yellowLightGlowingTime;
        this.greenLightGlowingTime = greenLightGlowingTime;
    }

    public long getRedLightGlowingTime() {
        return redLightGlowingTime;
    }

    public long getYellowLightGlowingTime() {
        return yellowLightGlowingTime;
    }

    public long getGreenLightGlowingTime() {
        return greenLightGlowingTime;
    }



}
