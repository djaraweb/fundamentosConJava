package com.v11.udemy.helpers;

import java.util.Random;

public class RandomUtilities {
    public static int generateRandomInt(int max, int min, Random random) {
        return random.nextInt(max - min + 1) + min;
    }

    public static double generateRandomDouble(double max, double min, Random random) {
        return (max - min) * random.nextDouble() + min;
    }
}
