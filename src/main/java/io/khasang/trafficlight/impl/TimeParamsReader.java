package io.khasang.trafficlight.impl;

import java.util.Scanner;

/**
 * Created by cliff on 2016-04-16.
 */
public class TimeParamsReader {

    public TimeParams readParams() {
        try (Scanner scanIn = new Scanner(System.in)) {
            System.out.print("\nEnter the RED light glowing time : ");
            final long redLightGlowingTime = scanIn.nextLong();
            checkParam(redLightGlowingTime);
            System.out.print("\nEnter the YELLOW light glowing time : ");
            final long yellowLightGlowingTime = scanIn.nextLong();
            checkParam(yellowLightGlowingTime);
            System.out.print("\nEnter the GREEN light glowing time : ");
            final long greenLightGlowingTime = scanIn.nextLong();
            checkParam(greenLightGlowingTime);
            System.out.println("You parameters accepted successfully.\n");
            return new TimeParams(redLightGlowingTime, yellowLightGlowingTime, greenLightGlowingTime);
        }
    }

    private void checkParam(final long param) {
        if (param < 0) {
            throw new IllegalArgumentException("Wrong parameter: " + param + "; -1time must be positive");
        }
    }

}
